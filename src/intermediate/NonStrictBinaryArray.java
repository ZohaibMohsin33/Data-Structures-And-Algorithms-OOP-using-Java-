package intermediate;

import java.util.Arrays;

public class NonStrictBinaryArray {
    public static void main(String[] args) {
        int[][] finding = {
                {2,4,6,8},
                {5,10,15,20},
                {7,14,21,28},
                {9,18,27,36}
        };

        System.out.println(Arrays.toString(extemeSearch(finding, 9)));

    }

    public  static int[] extemeSearch(int arr[][], int target){
        int row = 0;
        int col = arr[0].length - 1;

        while(col>=0 && row < arr.length){
            if(arr[row][col] == target)
                return new int[]{row,col};
            else if (arr[row][col] > target)
                col--;
            else
                row++;
        }

        return new int[]{-1,-1};

    }
}
