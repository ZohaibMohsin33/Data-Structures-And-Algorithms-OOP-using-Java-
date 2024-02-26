package bitwise;

public class Solution {

    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";

        for(int i = 0; i<haystack.length()-needle.length()-1;i++){
            String sub = haystack.substring(i,i+needle.length());
            if(needle.equals(sub))
                System.out.println(i);
        }

        System.out.println(-1);
    }
}