package recursion;

import java.util.ArrayList;

public class FourSum {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        int[] arr = {1,2,3};
        fourSum(outer,new ArrayList<Integer>(),arr,0);

        System.out.println(outer);


    }

    public static void fourSum(ArrayList<ArrayList<Integer>> outer,ArrayList<Integer> list,int[] arr,int index){
        if(index == arr.length){
            outer.add(new ArrayList<>(list));
            return;
        }

        int num = arr[index];

        fourSum(outer,list,arr,index+1);
        list.add(num);
        fourSum(outer,list,arr,index+1);
        list.remove(list.size()-1);
    }
}
