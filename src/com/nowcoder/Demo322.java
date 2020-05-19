package com.nowcoder;

/**
 * @Classname Demo32
 * @Description TODO
 * @Date 2020/3/19 16:26
 * @Created by Administrator
 */

/*
* 使用动态规划来计算
* */
public class Demo322 {


    public static int coinChange(int[] coins,int amount){
        // 定义状态数组,数组里面的数值代表是数量为当前索引时的最少硬币数量，不是金额
        int[] state = new int[amount+1];
        state[0] = 0;
        // 动态规划是从低向上设计的
        // 从初始状态一直转移到需要的n状态
        for (int cur = 1; cur <= amount; cur++) {
            // 初始化状态转移选择数组
            int[] minCount = new int[coins.length];

            // 该题多了限制条件，应为coins数组是可以变化的
            for (int i = 0; i < minCount.length; i++) {
                if(cur - coins[i] >= 0 && state[cur-coins[i]]!= -1)
                    minCount[i] = state[cur-coins[i]] +1;
                else minCount[i] = -1;
            }
            // 完成cur状态转移
            int minNum = -1;
            for (int i = 0; i < minCount.length; i++) {
                if(minCount[i] != -1 && minNum == -1) minNum = minCount[i];
                if(minNum != -1 && minCount[i]!= -1) minNum = Math.min(minNum,minCount[i]);
            }
            state[cur] = minNum;
        }
        for (int i : state) {
            System.out.println(i);
        }
        return state[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2,5,1},51));
    }
}
