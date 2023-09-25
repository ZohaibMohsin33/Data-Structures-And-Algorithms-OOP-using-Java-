package intermediate;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        //counting sequence

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the whole number");
//        long number = input.nextLong();
//        System.out.println("Enter the digit to find the occurances");
//        byte digit = input.nextByte();
//
//        long temp = number;
//        byte sum = 0 ;
//
//        while(temp != 0){
//            byte match = (byte) (temp%10);
//            if(match == digit){
//                sum +=1;
//            }
//
//            temp /= 10;
//        }
//        System.out.println("The total number of appearances are " + sum);

        //Reversing the number
//        System.out.println("Enter the number");
//        long number = input.nextLong();
//
//        long rev = 0;
//        while(number != 0){
//            byte digit = (byte)(number % 10);
//            if(rev == 0)
//                rev = digit;
//            else
//                rev = rev*10 + digit;
//
//            number /= 10;
//        }
//        System.out.println(rev);

        //Calculator

//        System.out.println("Enter the operation to perform or x to terminate");
//        char operator = input.next().trim().charAt(0);
//        int calculate = 0;
//        while(true){
//            if(operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%'){
//                System.out.println("Enter the number 1");
//                int num_1 = input.nextInt();
//                System.out.println("Enter the number 2");
//                int num_2 = input.nextInt();
//
//                switch (operator){
//                    case '+' :
//                        calculate = num_1 + num_2;
//                        break;
//                    case '-' :
//                        calculate = num_1 - num_2;
//                        break;
//                    case '/' :
//                        calculate = num_1 / num_2;
//                        break;
//                    case '%' :
//                        calculate = num_1 % num_2;
//                        break;
//                    case '*' :
//                        calculate = num_1 * num_2;
//                        break;
//                    default:
//                        break;
//                }
//                System.out.println("The result is " + calculate);
//            } else if (operator == 'x' || operator == 'X') {
//                System.out.println("The program ended");
//            }
//            else {
//                System.out.println("Wrong operator provided");
//            }
//
//        }


        //Factorial Program

//        System.out.println("Enter the number you want to get factorial of ");
//        int get_number = input.nextInt();
//
//        System.out.println("The answer of the number factorial is " + factorial(get_number));

        // Electricity bill

//        System.out.println("Enter the consumned number of units ");
//        int units = input.nextInt();
//        int total_bill = 0;
//
//        if (units <= 300) {
//            total_bill = units * 2;
//        } else if (units > 300 && units <= 500) {
//            total_bill = units * 5;
//        } else if (units > 500) {
//            total_bill = units * 7;
//        }

        //line charges added
//        total_bill += 150;
//
//        if(total_bill>2000){
//            System.out.println("The total bill is " + (total_bill+ (total_bill*0.05)));
//        }
//        else {
//            System.out.println("The total bill is " + total_bill);
//        }

        //Average of N numbers

//        int count = 0;
//        int sum   = 0;
//        System.out.println("Enter the numbers unless the zero comes");
//        while(true){
//            int number = input.nextInt();
//            if(number == 0)
//                break;
//
//            count++;
//            sum += number;
//        }
//        System.out.println("The average of the given numbers is " + sum/count);

        //Power in java

//        System.out.println("Enter the number whose power to be find");
//        int number = input.nextInt();
//
//        System.out.println("Enter the power to be find");
//        int pow_val = input.nextInt();
//
//        System.out.println("The answer is " + power(number,pow_val));

//        Distance between two points

//        System.out.println("Enter the X and Y axis of point 1");
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        System.out.println("Enter the X and Y axis of point 2");
//        int c = input.nextInt();
//        int d = input.nextInt();
//
//        System.out.println("The distance between two points is " + Math.sqrt(Math.pow(c-a,2) + Math.pow(d-b,2)));


//        Commission percentage
//        System.out.println("Enter the total number of sales you have done");
//        long sales = input.nextLong();
//
//        System.out.println("Enter the percentage of commission you take");
//        float commission = input.nextFloat();
//
//        commission /= 100;
//
//        System.out.println("The total commission amount you have got is " + (sales * commission));


//        Armstrong Number

//        System.out.println("Enter the number you want to confirm it is Armstrong or not");
//        int number = input.nextInt();
//        int resi   = number;
//        double total =0;
//
//        while(resi != 0){
//            int digit = resi % 10;
//            total = total + Math.pow( digit, 3);
//            resi /= 10;
//        }
//        if(total == number){
//            System.out.println("It is Armstrong number");
//        }
//        else{
//            System.out.println("It is not Armstrong number");
//        }

//        Finding the npr
//        System.out.println("Enter the total number of items for the permutation");
//        int items = input.nextInt();
//
//        System.out.println("Enter the items whose permutation to be find");
//        int find = input.nextInt();
//
//        System.out.println("The answer is " + factorial(items)/factorial(items-find));

        //        Finding the ncr
//        System.out.println("Enter the total number of items for the combinations");
//        int items = input.nextInt();
//
//        System.out.println("Enter the items whose combinations to be find");
//        int find = input.nextInt();
//
//        System.out.println("The answer is " + factorial(items)/(factorial(items-find) * factorial(find)));

//        Reverse a String

//        System.out.println("Enter a String");
//        String str = new String();
//        String copied = new String();
//        str = input.next();
//
//        for(int i = str.length()-1; i>=0;i--){
//            copied = copied + (str.charAt(i));
//
//        }
//        System.out.println("The original string is " + str);
//        System.out.println("The copied string is " + copied);

        //HCF

//        System.out.println("Enter the two digit");
//        int one = input.nextInt();
//        int two = input.nextInt();
//        int ans=0;
//        if(one<two){
//            for(int i=one;i>=0;i--){
//                if(one % i == 0 && two % i == 0){
//                    ans = i;
//                    break;
//                }
//            }
//        }
//        else{
//            for(int i=two;i>=0;i--){
//                if(one % i == 0 && two % i == 0){
//                    ans = i;
//                    break;
//                }
//            }
//
//        }
//        System.out.println("The H.C.F of the following numbers is " + ans);

//        L.C.M
//        System.out.println("Enter the number whose L.C.M's to be find ");
//        int one = input.nextInt();
//        int two = input.nextInt();
//
//
//        int lcm = one>two? one : two;
//        int val=0;
//        while(true){
//            if(lcm%one ==0 && lcm%two == 0){
//                val = lcm;
//                break;
//            }
//            ++lcm;
//        }
//        System.out.println("The L.C.M of the following two numbers is " + lcm);

    }

    static long power(int a, int b){
        long tot = a;
        for(int i =2;i<=b;i++){
            tot = tot*a;
        }
        return tot;
    }


    static int factorial (int n){
        if(n== 0 || n== 1){
            return 1;
        }
        else
            return n * factorial(n-1);

    }
}
