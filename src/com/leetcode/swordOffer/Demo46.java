package com.leetcode.swordOffer;

import sun.rmi.server.InactiveGroupException;

import java.sql.SQLOutput;

/**
 * @Classname Demo46
 * @Description TODO
 * @Date 2020/4/10 11:09
 * @Created by Administrator
 */
public class Demo46 {

    public int translateNum(int num) {
        // 将数字翻译成字符串
        // 使用动态规划的思想来实现
        String strNum = String.valueOf(num);
        int[] dp = new int[strNum.length()];
        // 初始化状态值
        dp[0] = 1;
        for (int i = 1; i < strNum.length(); i++) {
            // 当前值有两种情况，一种是可以和前面一个数字绑定在一起，另外一种是只可以单独存在
            if(strNum.charAt(i-1) == '0'){
                dp[i] = dp[i-1];
            }else if(Integer.parseInt(String.valueOf(strNum.charAt(i-1))) * 10 +Integer.parseInt(String.valueOf(strNum.charAt(i)))<=26){// 当前字符可以和前面的字符绑定一起
                dp[i] = i-2 >= 0 ? dp[i-1] + dp[i-2] : dp[i-1] + 1;
            }else{ // 大于26的时候，只能单独存在，
                dp[i] = dp[i-1];
            }
        }

        return dp[strNum.length() - 1];
    }

    public static void main(String[] args) {
        Demo46 demo46 = new Demo46();
        int re = demo46.translateNum(12258);
        System.out.println(re);
    }
}
