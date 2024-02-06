package intermediate;

public class ExtremeBinarySearch {
    //We are going to create an infinite sorted array in which we will find a specific number ......
    public static void main(String[] args) {
        int arr[] = {0,2,3,4,6,7,8,9,11,14,17,19,22,25,27,28,30,33,35,37,39,40};
        int tar = 40;
        int display = finder(arr, tar);
        System.out.println(display);

    }
    public static int finder(int[] nums, int target){
        int start = 0,end = 1;

        while(end < nums.length && nums[end]<target){

                int newStart = end + 1;
                end   = end + (end - start + 1) * 2;

                start = newStart;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid])
                return mid;
            else if ( target > nums[mid] )
                start = mid +1;
            else
                end = mid - 1;

        }
        return -1;
    }
}
