import java.util.ArrayList;
import java.util.List;

public class nQueens {

    public static boolean isSafe(char[][] board, int row, int col) {
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

    public static void nQueensProblem(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(boardToList(board));
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueensProblem(board, row + 1, result);
                board[row][j] = '.';
            }
        }
    }

    public static List<String> boardToList(char[][] board) {
        List<String> boardList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            boardList.add(new String(board[i]));
        }
        return boardList;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueensProblem(board, 0, result);

        return result;
    }

    public static void main(String[] args) {
        nQueens sol = new nQueens();
        List<List<String>> solutions = sol.solveNQueens(4);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
