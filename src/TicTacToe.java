import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        char[][]board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';

            }
        }

        char player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);


        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();


            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " wins");
                    printBoard(board);
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid Move");
            }
        }
    }

        public static boolean haveWon(char[][]board,char player){
                for (int row = 0; row < board.length; row++) {
                    for (int col = 0; col < board[row].length; col++) {
                        //same row
                        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                            return true;
                        }
                        //same col
                        if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                            return true;
                        }
                        //same diagonal
                        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                            return true;
                        }
                        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                            return true;
                        }


                    }
                }
            return false;
        }


    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(" " + board[row][col]);
                if (col < 2) System.out.print(" │"); // vertical separator
            }
            System.out.println();
            if (row < 2) System.out.println("───┼───┼───"); // horizontal separator
        }
    }



}
