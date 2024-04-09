package binarytrees;

import java.util.Scanner;

public class CutomBinaryTree {

    private Node root;
    private class Node{

        Node(int n){
            this.val = n;
        }
        int val;
        Node right;
        Node left;
    }

    public void populate(Scanner scanner){
        System.out.println("Enter your root node");
        int getIt = scanner.nextInt();
        Node node = new Node(getIt);
        this.root = node;
        populate(scanner,node);
    }

    public void populate(Scanner scanner,Node parent){
        System.out.println("Do u want to enter node to it's left " + parent.val);

        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + parent.val);
            int value = scanner.nextInt();
            parent.left = new Node(value);
            populate(scanner, parent.left);
        }

        System.out.println("Do u want to enter node to it's right " + parent.val);

        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + parent.val);
            int value = scanner.nextInt();
            parent.right = new Node(value);
            populate(scanner, parent.right);
        }
    }

    public void display(){
        display(this.root,"");
    }

    public void display(Node node,String indent){
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preetier(){
        preetier(this.root,0);
    }

    private void preetier(Node node,int level){
        if(node == null)
            return;

        preetier(node.right,level+1);

        if(level != 0){
            for(int i = 0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.val);
        }
        else{
            System.out.println(node.val);
        }

        preetier(node.left,level+1);
    }
}
