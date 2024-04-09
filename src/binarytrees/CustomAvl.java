package binarytrees;

public class CustomAvl {

    CustomAvl(){

    }
    Node root;
    private class Node{

        Node(int val){
            this.val = val;
        }
        int val;
        int height;
        Node left;
        Node right;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public int height(){
        return root.height;
    }

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }

        root = insert(root, new Node(val));
    }

    private Node insert(Node root, Node node) {
        if (root == null) {
            return node;
        }

        if (node.val > root.val) {
            root.right = insert(root.right, node);
        } else {
            root.left = insert(root.left, node);
        }

        // Update height of the current root
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Balance the tree if necessary and return the new root
        return rotate(root);
    }


    public void populate(int[] arr){
        for(int i = 0; i<arr.length;i++){
            insert(arr[i]);
        }

    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0) {
                // left left case
                return rightShift(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftShift(node.left);
                return rightShift(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                // right right case
                return leftShift(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rightShift(node.right);
                return leftShift(node);
            }
        }

        return node;
    }

    private Node rightShift(Node node){
        Node c = node.left;
        Node t = c.right;

        c.right = node;
        node.left = t;

        node.height = Math.max(height(node.left), height(node.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    private Node leftShift(Node node){
        Node c = node.right;
        Node t = c.left;

        c.left = node;
        node.right = t;

        node.height = Math.max(height(node.left), height(node.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
}
