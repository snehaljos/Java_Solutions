package NeetCode150;

import java.util.*;

//https://neetcode.io/
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'8', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        HashSet<String> h1 = new HashSet<String>();
int f=1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    //Check whether HashSet contains duplicate elements in row and column
                    if (h1.contains("row" + i + board[i][j]) || h1.contains("col" + j + board[i][j])) {
                        System.out.println(false);
                        f=0;
                        break;
                    }
                    h1.add("row" + i + board[i][j]);
                    h1.add("col" + j + board[i][j]);


                    //Check whether Box contains duplicate elements in it
                    if (h1.contains("box" + (i / 3) * 3 + j / 3 + board[i][j])) {
                        System.out.println(false);
                        f=0;
                        break;
                    }
                    h1.add("box" + (i / 3)  + j / 3 + board[i][j]);
                }


            }
            if(f==0){
                break;
            }
        }
        if(f!=0)
        System.out.println(true);
    }
}
