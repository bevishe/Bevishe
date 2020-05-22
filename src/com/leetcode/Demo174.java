package com.leetcode;

import sun.nio.cs.ext.MacHebrew;

/**
 * @Classname Demo174
 * @Description TODO
 * @Date 2020/3/26 17:25
 * @Created by Administrator
 */

/*
* 地下城游戏
* 使用动态规划的思想
* */
public class Demo174 {

    /*
    求解需要最低的健康点数也就是路径加起来的和数最大值
    * */

    public static int calculateMinimumHP(int[][] dungeon){
        int h = dungeon.length,w = dungeon[0].length;

        // 创建dp数组，记录在开始到达该位置所需要的最低血量
        int[][] dp = new int[h][w];

        for (int i = h-1; i >= 0; i--) {
            for (int j = w-1; j >= 0; j--) {
                // 初始化终点状态
                if(i==h-1 && j==w-1) {
                    dp[i][j] = dungeon[i][j] >= 0 ? 1 : 1 - dungeon[i][j];
                    continue;
                }

                // 碰见特殊情况，在最下面一行
                if(i == h-1){
                    // 保证当前血量大于0
                    dp[i][j] = Math.max(1-dungeon[i][j],1);
                    // 保证后面一个节点的血量满足要求
                    dp[i][j] = Math.max(dp[i][j],dp[i][j+1]  - dungeon[i][j]);

                // 特殊情况在最右边一列
                }else if(j == w-1){
                    // 保证当前血量大于0
                    dp[i][j] = Math.max(1-dungeon[i][j],1);
                    // 保证该节点的血量可以让后面一个节点的血量满足要求
                    dp[i][j] = Math.max(dp[i][j],dp[i+1][j]  - dungeon[i][j]);
                }else{
                    // 下面的节点比右边的节点更好
                    if(dp[i+1][j] < dp[i][j+1]){
                        dp[i][j] = Math.max(1,1-dungeon[i][j]);
                        dp[i][j] = Math.max(dp[i][j],dp[i+1][j]  - dungeon[i][j]);

                    // 右边的节点比下面的节点好
                    }else if(dp[i][j+1] < dp[i+1][j]){
                        dp[i][j] = Math.max(1,1-dungeon[i][j]);
                        dp[i][j] = Math.max(dp[i][j],dp[i][j+1]  - dungeon[i][j]);

                    }else{
                        int n1,n2;
                        n1 = Math.max(1,1-dungeon[i][j]);
                        n1 = Math.max(n1,dp[i+1][j]  - dungeon[i][j]);

                        n2 = Math.max(1,1-dungeon[i][j]);
                        n2 = Math.max(n2,dp[i][j+1] - dungeon[i][j]);

                        dp[i][j] = Math.min(n1,n2);
                    }
                }

            }
        }


        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(calculateMinimumHP(new int[][]{
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
        }));
    }
}
