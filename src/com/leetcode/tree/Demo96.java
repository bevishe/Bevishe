package com.leetcode.tree;

public class Demo96 {


    // dp 问题
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        // 外层是根节点从1到n用i记录
        for (int i = 2; i <= n; i++) {
            // 内层统计的是以i为根节点时，可能的情况数
            for (int j = i; j <=i ; j++) {
                dp[i] += dp[i-1]*dp[n-j];
            }
        }


        return dp[n];
    }

    public static void main(String[] args) {

    }
}
