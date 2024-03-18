package recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,4,56,7,0,2,3};
        sorting(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    public static void sorting(int[] arr,int low, int high){

        if(low>=high)
            return;

        int start = low;
        int end   = high;
        int mid  = low + (high-low)/2;
        int pivot = arr[mid];

        while(start <= end){

            while(pivot>arr[start])
                start++;

            while (pivot<arr[end])
                end--;

            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }

        sorting(arr,low,end);
        sorting(arr,start,high);

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]   = arr[b];
        arr[b]   = temp;
    }
}
