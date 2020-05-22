package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Classname Demo279
 * @Description TODO
 * @Date 2020/3/24 13:26
 * @Created by Administrator
 */

/*
* 完全平方数
*
* 使用动态规划的思想
* */

public class Demo279 {

    public static int numSquares(int n){

        // 使用动态规划的思想
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;

        //
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // 完全平方数
            int j = 1;
            while(i - j*j >0){arrayList.add(dp[i - j*j]);}
            
            int minN = arrayList.get(0);
            Iterator<Integer> iterator = arrayList.iterator();
            while(iterator.hasNext()){
                int temp = iterator.next();
                if(minN > temp) minN = temp;
            }
            dp[i] = minN;
        }
        return dp[n];
    }


    public static void main(String[] args) {


    }
}
