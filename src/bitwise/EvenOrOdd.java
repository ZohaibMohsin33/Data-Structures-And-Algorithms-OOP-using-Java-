package bitwise;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Function to find even or odd number.....
//        int num = 54;
//
//        if((num & 1) == 1)
//            System.out.println("The number is odd");
//
//        else
//            System.out.println("The number is even");

        //Given an array of numbers, every number is appeared twice, but just one number is appeared once.
//        int[] nums = {2,3,4,5,4,5,2,3,8};
//
//        int sum = 0;
//        for(int i : nums){
//            sum = sum^i;
//        }
//        System.out.println(sum);

        //Find ith bit of a number
//        int val = 10;
//        int find = 5;
//
//        int mask = 1 << (find - 1);
//
//        int cal = val & mask;
//        cal = cal >> (find - 1);
//        System.out.println(cal);

        //Reset ith bit
//        int val = 10;
//        int find = 2;
//
//        int mask = ~(1 << (find - 1));
//
//        int cal = val & mask;
//        System.out.println(val);
//        System.out.println(cal);

        //Numbers are appearing n times in an array

//        int[] arry = {2,2,3,3,5,5,5,3,7,2};
//        int result = 0;
//
//                for(int i = 0;i<8; i++){
//                    int sum = 0;
//
//
//                    int mask = 1<<i;
//
//                    for(int n : arry){
//                        if((n & mask) != 0)
//                            sum++;
//                    }
//
//                    if(sum%3 != 0)
//                    result = result | mask;
//                }
//
//        System.out.println(result);

//        Find the nth magic number

//        int number = 3;
//
//        int sum = 0;
//        int base = 5;
//        for(int i=0;i<8;i++){
//            int last = number & 1;
//
//            sum += (last * base);
//            base *= 5;
//            number = number>>1;
//        }
//
//        System.out.println(sum);
    }

}
