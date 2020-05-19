package com.leetcode.swordOffer;

/**
 * @Classname Demo60
 * @Description TODO
 * @Date 2020/4/8 11:21
 * @Created by Administrator
 */
public class Demo60 {
    // todo
    public double[] twoSum(int n){
        double[][] dp = new double[n][5*n+1];
        // 初始化状态
        for (int i = 0 ;i<6;i++){
            dp[0][i] = 1.0/6.0;
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println((double)(1.0/36.0));
    }
}
