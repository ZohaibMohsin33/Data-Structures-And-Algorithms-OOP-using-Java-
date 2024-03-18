package recursion;

import java.util.Arrays;

public class Practive {

    public static void main(String[] args) {

//        System.out.println(rotateString("abcde","cdeab"));

        String paragraph = paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        paragraph = paragraph.toLowerCase();

        String[] sr = paragraph.split(" ");


        System.out.println(Arrays.toString(sr));

    }

    static boolean rotateString(String s, String goal) {

        char[] arr = s.toCharArray();

        return rotate(arr, goal, 0, arr[0], 0);

    }

    static boolean rotate(char[] arr,String goal, int start, char c, int repeat){

        if(start+1 ==arr.length){
            arr[start-1] = arr[start];
            arr[start] = c;
            ++repeat;
            if(new String(arr).equals(goal))
                return true;

            else if (new String(arr) != goal && repeat<arr.length)
                return rotate(arr,goal,0,arr[0],repeat);

            else
                return false;
        }

        arr[start] = arr[start+1];
        return rotate(arr,goal,(start+1),c,repeat);
    }
}
