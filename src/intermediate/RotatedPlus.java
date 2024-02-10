package intermediate;

public class RotatedPlus {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        int target = 18;

        int gotten = pivotDetected(arr);
        System.out.println(gotten);
//        if(gotten != -1){
//            int firstBinary = BinarySearch(arr, 0, gotten, target);
//            if(firstBinary == -1) {
//                int secondBinary = BinarySearch(arr, gotten, arr.length-1,target);
//                System.out.println(secondBinary);
//            }
//            else{
//                System.out.println(firstBinary);
//            }
//        }
//        else{
//            int ans = BinarySearch(arr, 0 , arr.length-1, target);
//            System.out.println(ans);
//        }

    }
    // Here is the code for the pivot element detection
    static int pivotDetected(int[] arr){

        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid > 0 && mid <arr.length-1 && arr[mid] > arr[mid-1] && arr[mid]>arr[mid + 1]){
                System.out.println(mid);
                return mid;
            }


            else if (arr[mid] > arr[start])
                start = mid + 1;

            else
                end = mid;
        }

        return -1;
    }

    // Here should lye the code for the binary search

    static int BinarySearch(int[] arr, int start, int end, int target){
       while(start<=end){
           int mid = start + (end - start)/2;
           if(arr[mid] == target){
               return mid;
           }
           else if (arr[mid] > target)
               end = mid - 1;
           else
               start = mid + 1;
       }

       return -1;
    }
}


