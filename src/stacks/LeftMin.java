package stacks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class LeftMin {

    public static void main(String[] args) {

        int[] arr = {1,1};
        ArrayList<Integer> list = send(arr);

        System.out.println(list);
    }

    public static ArrayList<Integer> send(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                    int num = stack.pop();
                }

                if(stack.isEmpty()){
                    stack.add(i);
                    list.add(-1);
                }
                else{
                    list.add(stack.peek());
                    stack.add(i);

                }
        }


        return list;
    }
}
