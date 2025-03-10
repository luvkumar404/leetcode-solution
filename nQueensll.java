public class nQueensll{
    public static boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueensProblem(char board[][], int row, int[] count) {
        if (row == board.length) {
            count[0]++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueensProblem(board, row + 1, count);
                board[row][j] = 'x';
            }
        }
    }

    public int totalNQueens(int n) {
        if (n == 0) return 0;
        
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        
        int[] count = new int[1];
        nQueensProblem(board, 0, count);
        return count[0];
    }
}