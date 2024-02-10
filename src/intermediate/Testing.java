package intermediate;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(pivotDetected(arr));

    }
    static int pivotDetected(int[] arr){

        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if( mid>0 && mid<arr.length-1 && arr[mid] < arr[mid + 1] && arr[mid] < arr[mid - 1]){

                return mid;
            }


            else if (arr[mid] <= arr[start])
                start = mid + 1;

            else
                end = mid;
        }

        return -1;
    }
}
