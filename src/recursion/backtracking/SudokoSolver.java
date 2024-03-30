package recursion.backtracking;

public class SudokoSolver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solved(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static boolean solved(int[][] board){

        int n = board.length;
        int row = -1;
        int col = -1;

        boolean found = false;

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){
                if (board[i][j] == 0 ){
                    row = i;
                    col = j;
                    found = true;
                    break;
                }


            }
            if(found)
                break;
        }

        if(!found)
            return true;

        for(int i = 1; i<=9; i++){
            if (isSafe(board, row, col, i)) {
                board[row][col] = i;
                if (solved(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int number){

        for(int i = 0; i<9;i++){
            if(board[i][col] == number)
                return false;
        }

        for(int i = 0; i<9;i++){
            if(board[row][i] == number)
                return false;
        }

        int suqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % suqrt;
        int colStart = col - col % suqrt;

        for(int i = rowStart; i< rowStart + suqrt; i++){
            for(int j = colStart; j< colStart + suqrt; j++){
                if(board[i][j] == number)
                    return false;
            }
        }

        return true;
    }

    static void display(int[][] board){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
