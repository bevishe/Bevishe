package com.leetcode.swordOffer;

/**
 * @Classname Demo49
 * @Description TODO
 * @Date 2020/4/9 22:45
 * @Created by Administrator
 */

public class Demo49 {

    public int nthUglyNumber(int n){
        // 找到第n个丑数,其因数只含有2,3，5
        // 使用动态规划的思想，从低向上设计，从第一个一直到到第n个
        int[] dp = new int[n+1];
        int a = 1,b = 1,c = 1;
        // 初始化状态
        dp[1] = 1;
        // 下标代表的是第几个丑数，dp[0] 不存储数据，dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            // a b c用来记录当前第i个丑数的候选项，从中找到最小的记为第n个丑数即可
            int n2 = 2*dp[a],n3 = 3 * dp[b],n5 = 5 * dp[c];
            dp[i] = Math.min(Math.min(n2,n3),n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
