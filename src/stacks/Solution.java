package stacks;
import java.util.ArrayList;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};

        System.out.println(leftSmaller(heights));
        System.out.println(rightSmaller(heights));
        System.out.println(largestRectangleArea(heights));
    }
    static int largestRectangleArea(int[] heights) {

        ArrayList<Integer> right = rightSmaller(heights);
        ArrayList<Integer> left  = leftSmaller(heights);

        int max = 0;

        for(int i = 0; i<heights.length; i++){
            int count = (right.get(i)-left.get(i)-1)*heights[i];
            if (count>max)
                max = count;
        }

        return max;
    }

    public static ArrayList<Integer> rightSmaller(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
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

    public static ArrayList<Integer> leftSmaller(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
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
