package recursion;


import java.util.ArrayList;

public class CheckOccurance {

    public static void main(String[] args) {

        int[] arr = {1,3,4,2,6,4,8,10,8,7,3,5};
        ArrayList<Integer> types = new ArrayList<Integer>();

        counting(arr,types,4,0);
        System.out.println(types.toString());

    }

    //Using return statement with external ArrayList
    public static ArrayList<Integer> count(int[] arr, ArrayList<Integer> list,int target,int index){

        if(index == arr.length-1)
            return list;

        if(target == arr[index])
            list.add(index);

        return count(arr,list,target,index+1);

    }


    //Without using the return statement

    public static void counting(int[] arr, ArrayList<Integer> list,int target,int index){

        if(index == arr.length-1)
            return;

        if(target == arr[index])
            list.add(index);

        counting(arr,list,target,index+1);

    }
}
