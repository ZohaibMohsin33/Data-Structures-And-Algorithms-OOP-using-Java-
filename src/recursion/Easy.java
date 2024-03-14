package recursion;

public class Easy {

    public static void main(String[] args) {

        //Print the factorial of the number....

        int factorial = fact(5);
        System.out.println(factorial);

        //Print the sum of the digits of an integer
        int sum = summing(12345);
        System.out.println(sum);

        //Print the reverse of a number
        int num = 12345;
        System.out.println(revNum(num,(int)Math.log10(num)+1));

        //Count the number of zeros in a number
        int number = 104506000;

        int zeros = CountZeros(number,0);
        System.out.println(zeros);

    }

    static int fact(int n){
        if(n <= 1)
            return 1;

        return n * fact(n-1);
    }

    static int summing(int n){
        if(n == 0)
            return 0;

        return n%10 + summing(n/10);
    }

    static int revNum(int n,int power){
        if(n<10)
            return n;

        power--;
        return  ((int)Math.pow(10,power) * (n%10)) + revNum(n/10,power);
    }

    static int CountZeros(int num, int count){
        if (num == 0)
                return count;

        if(num%10 == 0){
            count++;
            return CountZeros(num/10,count);
        }
        else
            return CountZeros(num/10,count);
    }
}
