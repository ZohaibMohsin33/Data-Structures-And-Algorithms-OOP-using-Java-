package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] send = {1,5,7,14,26,78,88,90};
        int[] send2 = {45,66,78,89,91,92,94,96};

        int[] send3 = {100,56,45,38,24,12,-100,-150};
        int ans = BinSearch(send3,-150);
        System.out.println(ans);
    }

    static int BinSearch(int[] arr, int target){

        int start = 0;
        int end   = arr.length-1;


        boolean isAsc = arr[start] < arr[end];

        while(start<= end){
            int mid   = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }

            else if (isAsc == true) {

                if(arr[mid]<target)
                    start = mid+1;

                else
                    end = mid-1;

            }

            else if (isAsc == false) {

                if(arr[mid]>target)
                    start = mid+1;

                else
                    end = mid-1;

            }
        }

        return -1;

    }
}
