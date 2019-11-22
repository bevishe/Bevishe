package com.leetcode;

import java.util.Queue;

public class NQueens {

    private static final int N = 5;
    static int n = 0;

    /*
    *
    * 八皇后问题：
    * 使用回溯法
    *
    * */

    // Queen（t）摆放第t个皇后

    private static void queen(int t,int[][] bo){
        if(t==N){
            NQueens.n += 1;
            System.out.print("该摆放是可行的"+NQueens.n);
            // 将矩阵结果打印出
            int[] temp = new int[N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
//                    System.out.print(bo[i][j]+"\t");
                    if(bo[i][j] ==1) temp[i] = j+1;
                }
//                System.out.println();
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i <N; i++) {
            if (feasible(t,i,bo)){
                bo[t][i] = 1;//可以放置则将棋盘位置置为1
                queen(t+1,bo);
                bo[t][i] = 0;//将摆放的位置恢复
            }

        }
    }

    // factorial 判断（row,col）位置是否可行
    private static boolean feasible(int row,int col,int[][] bo){
        // 输入的位置不合法
        if(row>=N||row<0||col>=N||col<0) return false;
        // 遍历的位置已经有皇后了
        if(bo[row][col]==1) return false;
        // 判断行和列是否有冲突
        for (int i = 0; i < N; i++) {
            if(bo[i][col] == 1 || bo[row][i] ==1) return false;
        }
        //判断斜边是否有冲突，有四个方向需要判断
        for (int i = 0; i < N; i++) {
            //左上
            if(((row-i)>=0 &&(col-i)>=0)&&bo[row-i][col-i]==1) return false;
            // 右上
            if(((row-i)>=0&&(col+i<N))&&bo[row-i][col+i]==1) return false;
            //左下
            if(((row+i<N)&&(col-i>=0))&&bo[row+i][col-i]==1) return false;
            //右下
            if((row+i<N)&&(col+i<N)&&bo[row+i][col+i] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 1.用二维数据来定义棋盘，0代表没有棋子，1代表有棋子
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }

        queen(0,board);
        System.out.println(N+"皇后共有"+n+"种解法。");
    }
}