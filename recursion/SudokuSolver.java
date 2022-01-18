package work;
//https://leetcode.com/problems/sudoku-solver
public class SudokuSolver {
    public static void main(String[] args) {
        char[][] res = new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        if (solve(res)) {
            for (char[] row : res) {
                for (char num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int col = -1;
        int row = -1;
        boolean isFind = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                break;
            }
        }
        if (!isFind) {
            return true;
        }
        for (char i = '1'; i <= '9'; i++) {
            if (isSafe(board, col, row, i)) {
                board[row][col] = i;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int col, int row, char number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j] == number) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for (int i = startRow; i < startRow + sqrt; i++) {
            for (int j = startCol; j < startCol + sqrt; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}
