package com.leetcode;

import java.util.Queue;

public class NQueens {

    static int n = 0;

    /*
    *
    * 八皇后问题：
    * 使用回溯法
    *
    *
    * */

    // Queen（t）摆放第t个皇后
    private static void queen(int t,int[][] bo){

        if(t>8){
            NQueens.n += 1;
            System.out.println("该摆放是可行的"+NQueens.n);

            // 将矩阵结果打印出来
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(bo[i][j]+"\t");
                }
                System.out.println();
            }
            return;
        }else{
            for (int i = 0; i <8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (feasible(i,j,bo)){
                        bo[i][j] = 1;//可以放置则将棋盘位置置为1
                        queen(t+1,bo);
                        bo[i][j] = 0;//将摆放的位置恢复
                    }
                }
            }
        }
    }

    // factorial 判断（row,col）位置是否可行
    private static boolean feasible(int row,int col,int[][] bo){
        // 输入的位置不合法
        if(row>=8||row<0||col>=8||col<0) return false;
        // 遍历的位置已经有皇后了
        if(bo[row][col]==1) return false;
        // 判断行和列是否有冲突
        for (int i = 0; i < 8; i++) {
            if(bo[i][col] == 1 || bo[row][i] ==1) return false;
        }
        //判断斜边是否有冲突，有四个方向需要判断
        for (int i = 0; i < 8; i++) {
            //左上
            if(((row-1)>=0 &&(col-1)>=0)&&bo[row-1][col-1]==1) return false;
            // 右上
            if(((row-1)>=0&&(col+1<8))&&bo[row-1][col+1]==1) return false;
            //左下
            if(((row+1<8)&&(col-1>=0))&&bo[row+1][col-1]==1) return false;
            //右下
            if((row+1<8)&&(col+1<8)&&bo[row+1][col+1] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 1.用二维数据来定义棋盘，0代表没有棋子，1代表有棋子
        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
        queen(1,board);
    }
}