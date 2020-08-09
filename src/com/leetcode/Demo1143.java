package com.leetcode;

import com.work.day7_3.Demo1;

public class Demo1143 {


    // 使用二维dp来做，dp[i][j] 代表的是text1[0][i] 和 tetxt2[0][j] 最长的公共子序列
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 == null) return 0;
        // 使用二维dp
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i = 0;i<=text1.length();i++){
            for(int j= 0 ;j<=text2.length();j++){
                if(i == 0 || j==0) {
                    dp[i][j] = 0;
                    continue;
                }
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        Demo1143 demo1143 = new Demo1143();
        System.out.println(demo1143.longestCommonSubsequence("abcde","ace"));
    }
}
