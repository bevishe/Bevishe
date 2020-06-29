package com.leetcode.string;

/**
 * @Classname Demo5
 * @Description TODO
 * @Date 2020/6/16 15:33
 * @Created by Administrator
 */
public class Demo5 {

    // 求字符串中最长的回文子串
    public String longestPalindrome(String s) {

        /*
        * 暴力解法
        * 暴力解法就是依次判断s中的字符从前到后为作为子串的一个字符的时候最长的回文串长度
        * 原子符 babad
        * 什么时候可以使用动态规划 ？ 求最大 最小
        *
        * 2.使用dp来
        *
        * */
        if(s.length() == 0 || s.length() == 1) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = i; j < dp.length; j++) {
                if(i == j) dp[i][j] = true;
            }
        }
        int maxLength = 0,maxIndex = 0;
        // 最外层是子串的长度
        for (int i = 1; i < s.length() + 1; i++) {
            // j这一层是起始的索引
            for (int j = 0; j + i - 1< s.length(); j++) {
                int end = j + i - 1;
                if(j == end) dp[j][end] = true;
                else if(Math.abs(end-j) == 1) dp[j][end] = s.charAt(j) == s.charAt(end);
                else dp[j][end] = dp[j+1][end -1] && (s.charAt(j) == s.charAt(end));

                if(dp[j][end] && maxLength < i){
                    maxLength = i;
                    maxIndex = j;
                }
            }

        }
        return s.substring(maxIndex,maxIndex+maxLength);
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        String re =  demo5.longestPalindrome("aaaa");
        System.out.println(re);

    }
}
