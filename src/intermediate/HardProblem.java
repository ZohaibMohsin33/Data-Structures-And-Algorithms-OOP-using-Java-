//package intermediate;
//
//import java.util.ArrayList;
//
//public class HardProblem {
//    public static void main(String[] args) {
////        String t = getPermutation(3,3);
////        System.out.println(t);
//
//        String s = "123";
//        boolean[] arr = new boolean[s.length()];
//        ArrayList<String> list = new ArrayList<>();
//
//        getAllRecursions(s,"",arr,list);
//
//        for(int i = 0; i< list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//    }
//
//    public static String getPermutation(int n, int k) {
//
//        String s = "";
//        for(int i = 1; i <=n; i++){
//            s = s + i;
//        }
//
//
//        int num = 0;
//     return s;
//    }
//
//    public static void getAllRecursions (String s,String top, boolean[] arr,ArrayList list){
//        if(top.length() == s.length()){
//
//           list.add(top);
//           return;
//        }
//
//        for(int i = 0; i<s.length();i++){
//
//            if(!arr[i]){
//                arr[i] = true;
//                top = top + s.charAt(i);
//                getAllRecursions(s,top,arr,list,count+i);
//                top = top.substring(0,top.length()-1);
//                arr[i] = false;
//            }
//        }
//    }
//}
