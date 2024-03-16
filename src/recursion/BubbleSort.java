package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {3,2,8,9,1,10,90,5,2,12,14,25,47};
        sorting(arr,0,1,0);

        System.out.println(Arrays.toString(arr));

    }

    static void sorting(int[] arr, int start, int end, int finish){

        if (finish == arr.length - 1) // Terminate recursion when finish reaches the last index
            return;

        if (end == arr.length - finish) { // Move to the next pass
            sorting(arr, 0, 1, finish + 1);
            return;
        }


        if(arr[start]>arr[end])
            swap(arr,start,end);

        sorting(arr,end,end+1,finish);
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}


