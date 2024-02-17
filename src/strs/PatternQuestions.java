package strs;

public class PatternQuestions {
    public static void main(String[] args) {
//          Draw a square

//        for(int i = 0; i<5 ; i++){
//            for(int j = 0; j<5; j++){
//                System.out.print('*');
//            }
//            System.out.println("");
//        }
//
////        Draw a right angle triangle
//
//        for(int i = 0; i<5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print('*');
//            }
//            System.out.println("");
//        }
//
////        With Numbers
//        for(int i = 1; i<6; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
//
////        Draw a reverse right angle triangle
//
//        for(int i = 0; i<5; i++){
//            for (int j =0; j<5-i; j++){
//                System.out.print('*');
//            }
//            System.out.println("");
//        }
//
//
////        Again a right angle triangle but with diff. angle
//
//        for(int i = 1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//
//                if((i + j) > 5)
//                System.out.print('*');
//
//                else
//                System.out.print(' ');
//
//            }
//            System.out.println("");
//        }
//
////        Again a right angle triangle but with diff. angle and reversing the whole thing
//
//        for(int i = 1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//
//                if((i + j) <= 6)
//                    System.out.print('*');
//
//                else
//                    System.out.print(' ');
//
//            }
//            System.out.println("");
//        }
//
//
////        Again a right angle triangle but with diff. angle and reversing the whole thing
//
//        for(int i = 0; i<5; i++){
//            for(int j=1; j<=9; j++){
//
//                if((j == 5) || (j>= 5-i && j<=5+i))
//                    System.out.print('*');
//
//                else
//                    System.out.print(' ');
//
//            }
//            System.out.println("");
//        }
//
////        Now reversing the above program
//
//        for(int i = 5; i>0; i--){
//            for(int j=1; j<=9; j++){
//
//                if((j == 5) || (j>= 5-i && j<=5+i))
//                    System.out.print('*');
//
//                else
//                    System.out.print(' ');
//
//            }
//            System.out.println("");
//        }
//
        //        Again a right angle triangle but with diff. angle and reversing the whole thing

        for(int i = 1; i<6; i++){
            for(int j=1; j<=9; j++){

                if((j == 5) || (j>= 6-i && j<6+i))
                    System.out.print('*');

                else
                    System.out.print(' ');

            }
            System.out.println("");
        }

    }
}
