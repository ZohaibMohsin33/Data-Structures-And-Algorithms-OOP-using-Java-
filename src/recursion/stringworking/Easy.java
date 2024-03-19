package recursion.stringworking;

public class Easy {

    public static void main(String[] args) {

        String str = "bccaacad";
        String add = "";

        System.out.println(removeChr(add,str,0));

    }

    static String removeChr(String add, String check, int index){
        if(index == check.length())
            return add;

        if(check.charAt(index) != 'a'){
            add = add + check.charAt(index);
            return removeChr(add,check,index+1);
        }

        else{
            while(check.charAt(index) == 'a'){
                index++;
            }
            return removeChr(add,check,index);
        }

    }

}
