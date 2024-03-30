package recursion.backtracking;

public class NQueen {

    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(queenCombinations(board,0));


    }

    static int queenCombinations(boolean[][] board, int rows){
        if(rows == board.length){
            display(board);
            System.out.println("");
            return 1;
        }

        int count = 0;

        for(int i = 0; i<board.length; i++){
            if(isSafe(board,rows,i)){
                board[rows][i] = true;
                count += queenCombinations(board,rows+1);
                board[rows][i] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board,int row,int col){

        for(int i = 0; i<row; i++){
            if(board[i][col])
                return false;

        }

        int leftMax = Math.min(row,col);
        for(int i = 1;i<=leftMax;i++){
            if(board[row - i][col - i])
                return false;
        }

        int rightMax = Math.min(row,board.length-1-col);
        for(int i = 1;i<=rightMax;i++){
            if(board[row-i][col+i])
                return false;
        }

        return true;
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
