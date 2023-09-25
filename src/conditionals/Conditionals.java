package conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        //Question no 1 : Area of circle
//        final float PI = 3.142f;
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the radius of the circle");
//        float radius = input.nextFloat();
//
//        System.out.println("The total area of the given circle is " + PI * Math.pow(radius,2));

        //Question no 2 : Area of rectangle
//        float length,width;
//        System.out.println("Enter the length of the rectangle");
//        length = input.nextFloat();
//
//        System.out.println("Enter the width of the rectangle");
//        width = input.nextFloat();
//
//        System.out.println("Total Area of the circle is " + length*width);

        //Question no 3 : Area of triangle,same as isoceles
//        float base,height;
//        System.out.println("Enter the base of the triangle");
//        base = input.nextFloat();
//
//        System.out.println("Enter the height of the triangle");
//        height = input.nextFloat();
//
//        System.out.println("The area of the triangle is " + 0.5*base*height);


       //Question no 4 : Fibbonacci Series

//        int prev = 0;
//        int pres = 1;
//        int total;
//
//        if(prev == 0){
//            System.out.println(prev);
//        }
//        if(pres == 1){
//            System.out.println(pres);
//        }
//
//        for(byte i=0;i<=10;i++){
//
//            total = pres + prev;
//            System.out.println(total);
//
//            prev = pres;
//            pres = total;
//
//        }

        //Question no 5 : Input a number and print all the factors of that number
//        System.out.println("Enter the number whose factors to be find");
//        int number = input.nextInt();
//
//
//        System.out.println("The factors of the given number are : ");
//        for(int i = 1;i<=number;i++){
//            if(number%i == 0){
//                System.out.println(i);
//            }
//        }

//        Question no 6 : Input numbers unless user enter 0 and give the sum of all numbers

//          int total = 0;
//
//          while(true){
//              System.out.println("Enter the number");
//              int number = input.nextInt();
//              total += number;
//
//                      if(number == 0)
//                          break;
//
//          }
//        System.out.println("The total is " + total);

        //        Question no 7 : Input numbers unless user enter 0 and give the maximum of all numbers

          int max = 0;

          while(true){
              System.out.println("Enter the number");
              int number = input.nextInt();
              if(number > max)
                max = number;

                      if(number == 0)
                          break;

          }
        System.out.println("The maximum number is " + max);
    }
}
