package com.leetcode;

/**
 * @Classname Demo64
 * @Description TODO
 * @Date 2020/3/20 14:20
 * @Created by Administrator
 */

/*
* 最小路径和
* 动态规划问题：
*
* */
public class Demo64 {

    public static int minPathSum(int[][] grid){
        // 使用动态规划的方法
        int[][] dp = new int[grid.length][grid[0].length];
        if(grid.length == 0 || grid[0].length == 0) return 0;
        // 定义初始dp初始状态

        // 动态规划是自底向上设计的
        // 从头向后动态转移方程无法设计的时候，就从结果向初始状态设计动态转移方程
        // 初始状态在右下角，遵循从下到上，从右到左的顺序来转移状态

        for (int i = grid.length-1; i >= 0 ; i--) {
            // 从下到上
            for (int j = grid[0].length-1; j >= 0; j--) {
                if(i == grid.length-1 && j == grid[0].length -1){
                    dp[grid.length-1][grid[0].length - 1] = grid[grid.length -1][grid[0].length -1];
                    continue;
                }
                // 从右到左
                // 当dp在矩阵的四周时是特殊情况
                if(i==grid.length-1){ // 最后一行
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }else if(j==grid[0].length - 1){ // 在矩阵的最右边
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + grid[i][j];
                }
            }
        }
        return dp[0][0];
    }


    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
