package recursion.stringworking;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        sequence(str,"","abc");
        System.out.println(str);
    }

//    static void sequence (String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char add = up.charAt(0);
//        sequence(p + add, up.substring(1));
//        sequence(p,up.substring(1));
//    }

//    static ArrayList<String> sequence (String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            ArrayList<String> str = new ArrayList<>();
//            str.add(p);
//            return str;
//        }
//
//        ArrayList<String> str = new ArrayList<>();
//        char add = up.charAt(0);
//        str.addAll(sequence(p + add, up.substring(1))) ;
//        str.addAll(sequence(p, up.substring(1))) ;
//
//        return str;
//    }

    static void sequence (ArrayList<String> arr,String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            arr.add(p);
            return;
        }

        ArrayList<String> str = new ArrayList<>();
        char add = up.charAt(0);
        sequence(arr, p + add, up.substring(1)) ;
        sequence(arr, p, up.substring(1)) ;

    }
}
