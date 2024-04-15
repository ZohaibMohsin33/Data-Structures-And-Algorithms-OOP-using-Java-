package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class RightMin {

    public static void main(String[] args) {

        int[] arr = {1,1};
        ArrayList<Integer> list = send(arr);

        System.out.println(list);
    }

    public static ArrayList<Integer> send(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                int num = stack.pop();
            }

            if(stack.isEmpty()){
                stack.add(i);
                list.add(0,arr.length);
            }
            else{
                list.add(0,stack.peek());
                stack.add(i);

            }
        }


        return list;
    }
}
