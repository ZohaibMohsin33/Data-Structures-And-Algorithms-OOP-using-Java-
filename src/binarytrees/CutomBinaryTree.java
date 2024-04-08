package binarytrees;

import java.util.Scanner;

public class CutomBinaryTree {

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

        System.out.println("Do u want to enter node to it's left " + parent.val);

        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the left of " + parent.val);
            int value = scanner.nextInt();
            parent.right = new Node(value);
            populate(scanner, parent.right);
        }
    }
}
