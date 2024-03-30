package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllTrack {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        boolean[][] check = {{true,true,true},
                             {true,true,true},
                             {true,true,true}};


        allTracks("",str,check,0,0);

        System.out.println(str);

    }

    static void allTracks(String s, ArrayList<String> str, boolean[][] path, int r, int c){
        if((r == path.length-1) && (c == path[0].length-1)){
            str.add(s);
            return;
        }
        if(!path[r][c]){
            return;
        }

        path[r][c] = false;


        if(r < path.length-1)
            allTracks(s + 'D',str,path,r+1,c);

        if(c < path[0].length-1)
            allTracks(s + 'R',str,path,r,c+1);

        if(c>0)
            allTracks(s + 'L',str, path,r,c-1);

        if(r>0)
            allTracks(s + 'U',str, path,r-1,c);

        path[r][c] = true;

    }
}
