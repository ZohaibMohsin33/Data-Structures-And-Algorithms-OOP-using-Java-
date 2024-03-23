package recursion.backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {

        System.out.println(maze(3,3));
        ArrayList<String> arr = maze("",3,3);
        System.out.println(arr);

        mazeDiagonalalso("",3,3);

    }

    static int maze(int r, int c){
        if(r == 1 || c == 1)
            return 1;

       int left = maze(r-1,c);
       int right = maze(r,c-1);

        return left+right;
    }

//    static void maze(String p, int r, int c){
//        if(r == 1 && c == 1){
//            System.out.println(p);
//            return;
//        }
//
//        if(r > 1)
//            maze(p + 'D',r-1,c);
//
//        if(c>1)
//            maze(p + 'R',r,c-1);
//
//    }

    static ArrayList maze(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }

        ArrayList<String> str = new ArrayList<>();
        if(r > 1)
            str.addAll(maze(p + 'D',r-1,c));

        if(c>1)
            str.addAll(maze(p + 'R',r,c-1));

        return str;

    }

        static void mazeDiagonalalso(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1)
            mazeDiagonalalso(p + 'D',r-1,c);

        if(c>1)
            mazeDiagonalalso(p + 'R',r,c-1);

        if(c>1 && r>1)
            mazeDiagonalalso(p + 'C',r-1,c-1);

    }

//    static ArrayList mazeDiagonalalso(String p, int r, int c){
//        if(r == 1 && c == 1){
//            ArrayList<String> str = new ArrayList<>();
//            str.add(p);
//            return str;
//        }
//
//        ArrayList<String> str = new ArrayList<>();
//        if(r > 1)
//            str.addAll(mazeDiagonalalso(p + 'D',r-1,c););
//
//        if(c>1)
//            str.addAll(mazeDiagonalalso(p + 'R',r,c-1););
//
//        if(c>1 && r>1)
//            str.addAll(mazeDiagonalalso(p + 'C',r-1,c-1));
//
//        return str;
//
//    }
}
