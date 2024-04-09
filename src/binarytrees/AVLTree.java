//package binarytrees;
//import java.util.Scanner;
//
//public class AVLTree {
//
//    public class Node {
//        private int value;
//        private Node left;
//        private Node right;
//        private int height;
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//        }
//    }
//
//    private Node root;
//
//    public AVLTree() {
//
//    }
//
//    public int height(Node node) {
//        if (node == null) {
//            return -1;
//        }
//        return node.height;
//    }
//
//    public boolean isEmpty() {
//        return root == null;
//    }
//
//    public void insert(int value) {
//        root = insert(value, root);
//    }
//
//    private Node insert(int value, Node node) {
//        if (node == null) {
//            node = new Node(value);
//            return node;
//        }
//
//        if (value < node.value) {
//            node.left = insert(value, node.left);
//        }
//
//        if (value > node.value) {
//            node.right = insert(value, node.right);
//        }
//
//        node.height = Math.max(height(node.left), height(node.right)) + 1;
//        return rotate(node);
//    }
//
////    private Node rotate(Node node){
////        if(height(node.left)-height(node.right)>1){ //left functions will be apply here ....
////
////            if(height(node.left.left) - height(node.left.right)>0){ //left-left case
////                rightRotate(node); //right rotate on P...
////            }
////            else{ //left-right case
////                node.left = leftRotate(node.left); //left rotate on c
////                return rightRotate(node); //right rotate on p
////
////            }
////        }
////        else{ //right functions will be apply here
////
////        }
////    }
//
//    public void populate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            this.insert(nums[i]);
//        }
//    }
//
//    public void populatedSorted(int[] nums) {
//        populatedSorted(nums, 0, nums.length);
//    }
//
//    private void populatedSorted(int[] nums, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        this.insert(nums[mid]);
//        populatedSorted(nums, start, mid);
//        populatedSorted(nums, mid + 1, end);
//    }
//
//    public boolean balanced() {
//        return balanced(root);
//    }
//
//    private boolean balanced(Node node) {
//        if (node == null) {
//            return true;
//        }
//        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
//    }
//
//    public void display() {
//        display(this.root, "Root Node: ");
//    }
//
//    private void display(Node node, String details) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(details + node.value);
//        display(node.left, "Left child of " + node.value + " : ");
//        display(node.right, "Right child of " + node.value + " : ");
//    }
//}
//
//
