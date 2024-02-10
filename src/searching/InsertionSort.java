package searching;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,7,3,9,10,20,12,17,14,22,30,26};
        System.out.println(Arrays.toString(sorting(nums)));

    }

    static int[] sorting(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;

            }
        }
        return arr;
    }
}
