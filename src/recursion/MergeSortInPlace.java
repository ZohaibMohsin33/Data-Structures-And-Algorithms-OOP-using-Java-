package recursion;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {4,6,2,1};
        sorting(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int start, int end){
        if(end-start == 1)
            return;

        int mid = start + (end - start)/2;

        sorting(arr,start,mid);
        sorting(arr,mid,end);

        merge(arr,start,end,mid);

    }

    public static void merge(int [] arr, int start, int end, int mid){

        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }
}
