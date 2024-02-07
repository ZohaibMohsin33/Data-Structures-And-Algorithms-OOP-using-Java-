package intermediate;

public class RotatedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int start  = 0, end = nums.length-1;
        int num = nums[0];
        while (start<end){
            int mid = start + (end - start)/2;
            if(num>nums[mid])
                end = mid;

            else
                start = mid + 1;
        }
        System.out.println(start);
    }
}

