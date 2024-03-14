package recursion;

public class UsingArray {

    public static void main(String[] args) {
        int[] arr = {2,4,11,10,13,19};

        System.out.println("The array is sorted ascendingly " + checkSorted(arr,0));
    }

    public static boolean checkSorted(int[] arr, int index){
        if(index == arr.length-1)
            return true;

        if(arr[index]>arr[index+1])
            return false;

        else
            return checkSorted(arr,index+1);
    }
}
