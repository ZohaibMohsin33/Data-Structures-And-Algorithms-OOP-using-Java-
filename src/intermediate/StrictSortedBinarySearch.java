package intermediate;

import BinarySearch.BinarySearch;

import java.util.Arrays;

public class StrictSortedBinarySearch {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,5,7,8},
                {9,11,13,17,20},
                {22,25,27,29,30},
                {31,35,38,40,42}
        };
        int target = 42;

        System.out.println(Arrays.toString(matrixSearch(arr,target)));
    }

    static int[] matrixSearch(int arr[][], int target) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int newCol = (arr[0].length) / 2;


        while (rowStart < (rowEnd-1)) {

            int mid = rowStart + (rowEnd - rowStart)/2;

            if(arr[mid][newCol] == target)
                return new int[]{mid,newCol};

            else if(arr[mid][newCol] > target) {
                rowEnd = mid;
            }
            else if (arr[mid][newCol]<target) {
                rowStart = mid;
            }

        }

        if(arr[rowStart][newCol] == target)
            return new int[]{rowStart,newCol};

        else if (arr[rowStart + 1][newCol] == target)
            return new int[]{rowStart + 1,newCol};

        else if (arr[rowStart][newCol] >= target)
            return BinarySearch(arr[rowStart],rowStart,0,newCol,target);
        else if (arr[rowStart + 1][newCol] >= target)
            return BinarySearch(arr[rowStart + 1],rowStart+1,0,newCol,target);
        else if (arr[rowStart][newCol] <= target && target <= arr[rowStart][arr[0].length - 1])
            return BinarySearch(arr[rowStart],rowStart,newCol,arr[0].length - 1,target);
        else if (arr[rowStart+1][newCol] <= target && target <= arr[rowStart+1][arr[0].length - 1])
            return BinarySearch(arr[rowStart+1],rowStart+1,newCol,arr[0].length - 1,target);
        else
            return new int[]{-1,-1};
    }

    static int[] BinarySearch(int[] matrix,int row, int cStart,int cEnd, int target ){

        while(cStart <= cEnd){

            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[mid] == target)
                return new int[]{row,mid};

            else if(matrix[mid] < target)
                cStart = mid + 1;

            else
                cEnd = mid -1;
        }

        return new int[]{-1,-1};
    }


}
