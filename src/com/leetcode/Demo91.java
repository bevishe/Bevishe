package com.leetcode;

/**
 * @Classname Demo91
 * @Description TODO
 * @Date 2020/3/24 16:44
 * @Created by Administrator
 */

/**
 * 解码方法
 * 使用动态规划的思想
 *
 */
public class Demo91 {

    public static int method1(){
        return 0;
    }

    public static int numDecodings(String s){
        // 使用动态规划的思想
        // dp数组中记录的是该长度的字符串可有的解码种类数量
        int[] dp = new int[s.length()+1];
        if(s.length() ==0 || s.charAt(0) == '0') return 0;
        else if(s.length() == 1) return 1;
        dp[0] = 0;
        // 动态规划是从底向上设计的,
        // 特殊情况是 当前元素是否为零
        for (int i = 0; i < s.length(); i++) {
            if(i==0) {dp[i+1] = 1; continue;}
            if(s.charAt(i) == '0'){
                // 合规
                if(s.charAt(i-1) != '0' && Integer.valueOf(String.valueOf(s.charAt(i-1)))<=2){
                    dp[i+1] = i-2>=0 ? dp[i-1]:1;
                }else{  // 不合规
                    return 0;
                }
            }else{
                // 不合规,不能和前面的字母连着解码
                if(s.charAt(i-1) == '0' || Integer.valueOf(String.valueOf(s.charAt(i-1)))*10 + Integer.valueOf(String.valueOf(s.charAt(i)))>26){
                    dp[i+1] = dp[i];
                }else{ // 可以和前面的连着解码
                    if(i-2>=0) dp[i+1] = dp[i] + dp[i-1];
                    else dp[i+1] = dp[i] + 1;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);

        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
        System.out.println(Integer.valueOf(String.valueOf('1')));
    }
}
