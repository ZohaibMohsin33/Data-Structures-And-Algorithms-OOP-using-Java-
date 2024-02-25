package BinarySearch;

public class CopySolution {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(findPivot(arr));

    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust start and end pointers based on the comparison
            if (arr[start] < arr[mid]) {
                start = mid + 1; // Search in the right half
            } else if (arr[start] > arr[mid]) {
                end = mid - 1; // Search in the left half
            } else {
                // If start and mid are equal, move the start pointer until they're not
                while (start < mid && arr[start] == arr[mid]) {
                    start++;
                }
                // If end and mid are equal, move the end pointer until they're not
                while (end > mid && arr[end] == arr[mid]) {
                    end--;
                }
            }
        }
        return -1; // No pivot found
    }

}
