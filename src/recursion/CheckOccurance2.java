package recursion;

import java.util.ArrayList;

public class CheckOccurance2 {

    public static void main(String[] args) {

        int[] arr = {0,5,7,2,9,5,3,1,5};
        ArrayList<Integer> result = count(arr,5,0);

        System.out.println(result.toString());

    }

    public static ArrayList<Integer> count(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(target == arr[index])
            list.add(index);

        if(index == arr.length-1)
            return list;

        ArrayList<Integer> resultFromBack = count(arr,target,index+1);
        list.addAll(resultFromBack);
        return list;
    }

}
