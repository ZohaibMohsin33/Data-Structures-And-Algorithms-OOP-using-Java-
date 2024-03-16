package recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3,2,8,9,1,10,90,5,2,12,14,25,47};
        int[] arr2 = {4,3,2,1};
        sorting(arr2,arr2.length-1,0,0);

        System.out.println(Arrays.toString(arr2));

    }

    static void sorting(int[] arr, int position, int newIndex, int index){

        if(position == 0)
            return;

        if (index == position){
            swap(arr,position,newIndex);
            sorting(arr,position-1,0,0);
            return;
        }

        if(arr[index]>arr[newIndex]){
            sorting(arr, position, index,index+1);
            return;
        }

        sorting(arr,position,newIndex,index+1);

    }


    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
