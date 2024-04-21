package hashing;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {

        int[] nums = {2,5,1,4,5,2,3,2,4,4,9};
        int[] newOne = sorting(nums);

        System.out.println(Arrays.toString(newOne));
    }

    static int[] sorting(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }

        int[] newArr = new int[max+1];


        for(int i = 0;i<arr.length;i++){
            newArr[arr[i]] = newArr[arr[i]]+1;
        }

        int index = 0;
        for(int i =0;i<newArr.length;i++){
            int val = newArr[i];
            for(int j = 1; j<=val;j++){
                arr[index++] = i;
            }
        }

        return arr;
    }
}
