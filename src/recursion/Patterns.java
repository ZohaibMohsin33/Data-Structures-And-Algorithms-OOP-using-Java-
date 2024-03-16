package recursion;

public class Patterns {

    public static void main(String[] args) {

        pattern(10,1);

    }

    static void pattern(int n, int n2){

        System.out.print("*");

        if(n == 1 && n2==1)
            return;
        if(n>1 && (n2 == n)){

            System.out.println("");
            pattern(n-1, 1);

            return;

        }


        pattern(n,n2+1);

    }
}
