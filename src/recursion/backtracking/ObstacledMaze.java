package recursion.backtracking;

public class ObstacledMaze {

    public static void main(String[] args) {

        boolean[][] set = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        mazeWithObstacle("",set,0,0);

    }

    static void mazeWithObstacle(String p ,boolean[][] check, int r,int c){
        if(r == check.length-1 && c == check[0].length-1){
            System.out.println(p);
            return;
        }

        if(check[r][c] == false)
            return;

        if(r < check.length-1)
            mazeWithObstacle(p + 'D',check,r+1,c);

        if(c < check[0].length-1)
            mazeWithObstacle(p + 'R',check,r,c+1);

    }
}
