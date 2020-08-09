package com.leetcode.array;

public class Demo62 {

    public int uniquePaths(int m,int n){
        // 从终点向起点看
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = 1;
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if(i == m-1 && j == n-1) continue;

                if(i == m-1){
                    dp[i][j] = dp[i][j+1];
                }else if(j == n-1){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j] = dp[i][j+1] + dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Demo62 demo62 = new Demo62();
        System.out.println(demo62.uniquePaths(3,2));
    }
}
