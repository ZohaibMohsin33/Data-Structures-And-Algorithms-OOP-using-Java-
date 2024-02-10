package searching;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(sorted(nums)));

    }

    static int[] sorted(int[] arr){

        for(int i = 0; i<arr.length ; i++){
            int temp = arr[0] ;
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(temp == arr[0])
                break;
        }
        return arr;
    }
}
