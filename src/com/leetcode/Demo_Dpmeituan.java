package com.leetcode;

/**
 * @Classname Demo_Dpmeituan
 * @Description TODO
 * @Date 2020/4/4 13:26
 * @Created by Administrator
 */
public class Demo_Dpmeituan {


    //
    public void method(int[] a,int[] b){
        // 使用动态规划的方法
        // a中记录的是保温箱中已有的货物数量，b中是该保温箱中最大的容量
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        // 最小的箱子数量k，最单的时间t
        int k,t;

        // 动态规划是自底向上设计的，
        // 定义状态数组 ,b中最大数，肯定优先装
        // dp中代表的是当前当前的货物为i是当前所需要的最少保温箱数
        int[] dp = new int[sum+1];
        // 初始化dp状态
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {

        }

    }

    public static void main(String[] args) {
        /*
        * 动态规划问题：
        * 1.是从低向上设计的，
        * 2.找到动态转移方程，转移时的条件
        * 3.初始化状态
        *
        * */
    }
}
