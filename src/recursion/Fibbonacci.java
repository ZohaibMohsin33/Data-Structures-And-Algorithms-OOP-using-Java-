package recursion;

public class Fibbonacci {


    public static void main(String[] args) {

//        Using iterations
        int one = 0;
        int two = 1;
        int sum = one + two;

        for(int i = 3;i<11;i++){
            int temp = two;
            two = sum;
            sum = sum + temp;
        }

        System.out.println(sum);

//        Now it's time to use recursions

        int ans = fibonacci(10);
        System.out.println(ans);

//        Binary Search using recursion
        int[] nums = {1,3,5,7,18,25,26,39};
        int searched = binarySearch(nums,0,nums.length-1,7);
        System.out.println(searched);


    }

    public static int fibonacci(int n){
        if(n<2)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start>end)
            return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] < target)
            return binarySearch(arr, mid+1, end, target);
        else if(arr[mid] > target)
            return binarySearch(arr, start, mid-1, target);

        else {
            return mid;

        }
    }
}
