package recursion.stringworking;

public class Permutations {

    public static void main(String[] args) {

        perms("","abc");

    }
// NOte : Try to study about the inclusive and exculsive behaviour of substring method
    public static void perms(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            perms(f+c+s,up.substring(1));
        }

    }
}
