package binarytrees;

public class BinarySearchTree {

    private Node root;

    private class Node{

        Node(int val){
            this.val = val;
        }
        public int getVal(){
            return this.val;
        }
        int val;
        int height;
        Node left;
        Node right;

    }

    public void insert(int val){
        if(root == null){
            Node node = new Node(val);
            root = node;

        }
        else{
            Node node = new Node(val);
            insert(root,node);
        }

    }

    public int getRootHeight(){
        this.root.height = Math.max(getHeight(this.root.left),getHeight(this.root.right)) + 1;
        return this.root.height;
    }
    private void insert(Node root,Node node){
        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (node.val > current.val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;

        // At this point, current is null and parent is the parent of the new node
        if (node.val > parent.val) {
            parent.right = node;
        } else {
            parent.left = node;
        }
    }

    public int getHeight(Node node){
        if(node == null)
            return -1;

        return node.height;
    }



    public boolean isEmpty(){
        if(root == null)
            return true;

        return false;
    }

    public void display(){
        if(root != null)
            display(root,"The root node is : ");
    }
    private void display(Node node,String details){
        if(node == null)
            return;

        System.out.println(details + node.val);
        display(node.left,"The left value of node " + node.val + " is ");
        display(node.right,"The Right value of node " + node.val + " is ");
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    public boolean isBalanced(Node node){
        if(node == null)
            return true;
        return Math.abs(getHeight(node.left)-getHeight(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

}
