package BinarySearch;

public class FindInRotatedDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int ans = findPivot(arr);
        if(ans != -1)
            System.out.println(ans);
        else
            System.out.println("Pivot not found");
    }

    public static int findPivot(int[] arr){
        int start = 0; int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;

            if(start == mid && mid == end){
                if(arr[start]>arr[start+1])
                    return start;

                start++;

                if(arr[end] < arr[end-1])
                    return end-1;

                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end]))
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
