package com.leetcode.swordOffer;

/**
 * @Classname Demo47
 * @Description TODO
 * @Date 2020/4/10 10:52
 * @Created by Administrator
 */
public class Demo47 {

    public int maxValue(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        // 典型的dp问题
        // 设置dp数组，记录从当前位置开始，到终点可以拿的最大价值数量
        int[][] dp = new int[grid.length][grid[0].length];
        for (int h = grid.length -1; h >= 0; h--) {
            for (int w = grid[0].length - 1; w >= 0; w--) {
                // 初始化状态
                if(h == grid.length -1 && w == grid[0].length - 1) dp[h][w] = grid[h][w];
                // 特殊情况
                // 最下面一行
                else if(h == grid.length -1){
                    dp[h][w] = grid[h][w] + dp[h][w+1];
                // 最右边一列
                }else if(w == grid[0].length - 1){
                    dp[h][w] = grid[h][w] + dp[h+1][w];
                // 在内部
                }else{
                    dp[h][w] = Math.max(dp[h+1][w],dp[h][w+1]) + grid[h][w];
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {

    }
}
