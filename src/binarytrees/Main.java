package binarytrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CutomBinaryTree br = new CutomBinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        br.populate(scanner);
////        br.display();
//        br.preetier();

//        BinarySearchTree br = new BinarySearchTree();
//        br.insert(20);
//        br.insert(10);
//        br.insert(30);
//        br.insert(5);
//        br.insert(17);
//        br.insert(40);
//
//        System.out.println(br.getRootHeight());

        CustomAvl avl = new CustomAvl();
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1;
        }
        avl.populate(arr);
        System.out.println("Height of the root: " + avl.height());
    }
}
