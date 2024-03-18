package recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

    int[] arr = sort(new int[]{1,2,3,67,45,12,30,98,23,10,3});
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        if(arr.length == 1)
            return arr;

        int[] arr1 = sort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] arr2 = sort(Arrays.copyOfRange(arr,arr.length/2,arr.length));

        return merge(arr1,arr2);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] back = new int[arr1.length + arr2.length];
        int first = 0;
        int second = 0;
        int index = 0;

        // Loop until both arrays are fully traversed
        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] < arr2[second]) {
                back[index++] = arr1[first++];
            } else {
                back[index++] = arr2[second++];
            }
        }

        // Copy remaining elements from arr1 if any
        while (first < arr1.length) {
            back[index++] = arr1[first++];
        }

        // Copy remaining elements from arr2 if any
        while (second < arr2.length) {
            back[index++] = arr2[second++];
        }

        return back;
    }


}
