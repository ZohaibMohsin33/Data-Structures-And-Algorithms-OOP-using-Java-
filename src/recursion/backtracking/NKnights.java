package recursion.backtracking;

public class NKnights {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(nknights(board,0,0,8));

    }

    static int nknights(boolean[][] board, int row, int col, int limit){
        if(limit == 0){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        if(row == board.length-1 && col == board.length)
            return count;
        if (col == board.length) {
            count += nknights(board,row+1,0,limit);
            return count;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            count += nknights(board,row,col+1,limit-1);
            board[row][col] = false;
        }

        count += nknights(board,row,col+1,limit);

        return count;
    }

    static boolean isSafe(boolean[][] board, int row,int col){
        if(boundCheck(board,row-2,col+1)){
            if(board[row-2][col+1])
                return false;
        }

        if(boundCheck(board,row-2,col-1)){
            if(board[row-2][col-1])
                return false;
        }

        if(boundCheck(board,row-1,col+2)){
            if(board[row-1][col+2])
                return false;
        }

        if(boundCheck(board,row-1,col-2)){
            if(board[row-1][col-2])
                return false;
        }

        return true;
    }

    static boolean boundCheck(boolean[][] board, int row,int col){
        if(row>=0 && row<board.length && col>= 0 && col<board.length)
            return true;

        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] arr : board ){
            for(boolean element : arr){
                if(element)
                    System.out.print("Q");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
