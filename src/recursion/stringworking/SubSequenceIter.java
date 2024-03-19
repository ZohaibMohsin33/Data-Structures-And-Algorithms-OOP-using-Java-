package recursion.stringworking;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceIter {

    public static void main(String[] args) {

        List<List<Integer>> result = subsetDuplicate(new int[]{1,2,3,3});
        for(List<Integer> a : result){
            System.out.println(a);
        }


    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int j = 0; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }


        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end = 0;
        for(int i = 0;i<arr.length;i++){
            start = 0;


            if(i>0 && arr[i] == arr[i-1])
                start = end+1;
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }


        return outer;
    }

}
