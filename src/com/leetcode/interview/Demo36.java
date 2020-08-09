package com.leetcode.interview;

import com.work.day7_3.Demo1;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

public class Demo36 {
    // 判断当前的已有数字是否合法

    public boolean isValidSudoku(char[][] board) {
        boolean re = true;

        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curChar = board[i][j];
                if(curChar != '.'){
                    int curInt = Integer.parseInt(String.valueOf(curChar));
                    row[i][curInt -1] += 1;
                    col[curInt -1][j] += 1;
                    int boxI = (i/3) * 3 + j / 3, boxJ = curInt-1;
                    box[boxI][boxJ] += 1;

                    if(row[i][curInt - 1] > 1 || col[curInt - 1][j] > 1 || box[boxI][boxJ] > 1) return false;
                }
            }
        }

        return re;
    }


    public static void main(String[] args) {
        Demo36 demo36 = new Demo36();
        System.out.println(demo36.isValidSudoku(new char[][]
                {{'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}}
    ));

    }
}
