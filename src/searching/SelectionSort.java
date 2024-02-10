package searching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(Arrays.toString(sorted(nums)));

    }

    static int[] sorted(int[] arr){

        for(int i=0;i < arr.length; i++){
            int max = arr[i];
            int temp = i;
            for(int j=i; j<arr.length;j++){
                if(max  > arr[j]) {
                    max = arr[j];
                    temp = j;
                }
            }
            arr[temp] = arr[i];
            arr[i] = max;
        }
        return arr;
    }
}
