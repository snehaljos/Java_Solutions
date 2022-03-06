package work;
//https://leetcode.com/problems/n-queens

import java.util.ArrayList;

import java.util.List;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solve(board, 0, res);
        System.out.println(res);


    }

    public static void solve(boolean[][] board, int row, List<List<String>> res) {
        if (row == board.length) {
            String st = "";
            List<String> res1 = new ArrayList<>();
            for (boolean[] temp : board) {
                for (boolean temp1 : temp) {
                    if (temp1) {
                        st = st + "Q";

                    } else {
                        st = st + ".";

                    }

                }
                res1.add(st);


                st = "";
            }
            res.add(res1);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                solve(board, row + 1, res);
                board[row][i] = false;
            }
        }
        return;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i <= row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        return true;
    }
}
