package com.nowcoder;

import java.util.List;

/**
 * @Classname Demo120
 * @Description TODO
 * @Date 2020/3/19 17:42
 * @Created by Administrator
 *
 */
/*
*
* 三角形最小路径和：
* 使用动态规划的思想
* 动态转移方程无法实现
* 贪心算法：
*   1.
* 回溯法
*
*
* */


public class Demo120 {
    public static int method1(List<List<Integer>> triangle){
        // 动态规划问题
        // 先计算dp[i][0] 的最短路径 然后是 dp[i][1]

        int[][] dp = new int[triangle.size()][triangle.size()];
        if(triangle.get(0).isEmpty()) return 0;
        dp[0][0] = triangle.get(0).get(0);

        // 动态规划是自顶向上的
        // 从初始状态一直转移到需要求解的状态上面
        for (int x = 1; x < triangle.size(); x++) {
            for (int y = 0; y <= x; y++) {
                // 这是最后一行的列坐标
                if(y == x) dp[x][y] = dp[x-1][y-1] + triangle.get(x).get(y);
                else if(y-1>=0)
                    dp[x][y] = Math.min(dp[x-1][y],dp[x-1][y-1]) + triangle.get(x).get(y);
                else dp[x][y] = dp[x-1][y] +triangle.get(x).get(y);
            }
        }
        
        // 遍历数组dp中最后一行的，找出其中的最小值
        int re = dp[triangle.size()-1][0];
        for (int i = 0; i < dp[triangle.size()-1].length; i++) {
            if(re > dp[triangle.size()-1][i]) re = dp[triangle.size()-1][i];

        }
        return re;
    }



}
