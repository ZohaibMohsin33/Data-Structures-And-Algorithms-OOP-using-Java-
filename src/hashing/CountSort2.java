package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort2 {
    public static void main(String[] args) {

        int[] nums = {2,5,1,4,5,2,3,2,4,4,9};
        int[] newOne = sorting(nums);

        System.out.println(Arrays.toString(newOne));
    }

    static int[] sorting(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        int index = 0;
        for(int i = min;i<=max;i++){
            Integer val = map.get(i);
            if(val != null){
                for(int j = 1;j<=val;j++)
                    arr[index++] = i;
            }

        }

        return arr;
    }
}
