package hashing;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] arr = {5,40,9,17,571,6669};
        System.out.println(Arrays.toString(arr));

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();

        for(int i = 1; i<max/i; i *= 10){
            countSort(arr,i);
        }
    }

    static void countSort(int[] arr,int exp){
        int n = arr.length;

        int[] count = new int[10];
        int[] output= new int[n];

        for(int i = 0; i<n; i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i = 1; i<10; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i = n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        System.out.println(Arrays.toString(output) + "this is output");
        System.arraycopy(output,0,arr,0,n);
    }
}
