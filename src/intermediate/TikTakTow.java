package intermediate;

import java.util.Scanner;

public class TikTakTow {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean IsWin = false;

        while(!IsWin){
            display(board);
            player = (player == 'X') ? 'O' : 'X';
            System.out.println("The player " + player + " has been entered.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the row");
            int row = scanner.nextInt();
            System.out.println("Enter the column");
            int col = scanner.nextInt();

            if(board[row-1][col-1] != ' '){
                System.out.println("Invalid move try again");
                continue;
            }

            board[row-1][col-1] = player;
            IsWin = haveWon(board,player);

        }

        if(IsWin){
            System.out.println("The player has won : " + player);
            display(board);
        }
    }

    public static boolean haveWon(char[][] board, char player){

        for(int i = 0;i<board.length;i++) {

//            finding columns
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        for(int i = 0;i<board.length;i++) {
//            finding rows
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }

//            finding diagonals
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                return true;

            if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
                return true;

            return false;

    }

    public static void display (char[][] board){

        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
