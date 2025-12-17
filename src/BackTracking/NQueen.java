package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        int solutions = solve(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    public static int solve(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;  // place queen
                count += solve(board, row + 1); // recurse
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : "X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
