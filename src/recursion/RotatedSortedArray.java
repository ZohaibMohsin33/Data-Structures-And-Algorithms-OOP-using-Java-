package recursion;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {5,6,7,13,15,18,90,1,3,4};

        System.out.println(search(arr,4,0,arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){
        if(start>end)
            return -1;

        int mid = start + (end - start)/2;

        if (arr[mid] == target)
            return mid;

        if(arr[mid] >= arr[start]){
            if(target <= arr[mid] && target>= arr[start])
                return search(arr, target, start, mid-1);
            else
                return search(arr, target, mid+1, end);
        }

        if(target >= arr[mid] && target<= arr[end] )
            return search(arr, target, mid+1, end);

        return search(arr, target, start, mid-1);
    }
}

