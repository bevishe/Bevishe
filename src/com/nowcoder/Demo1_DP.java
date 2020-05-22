package com.nowcoder;

/**
 * @Classname Demo1_DP
 * @Description TODO
 * @Date 2020/3/19 13:43
 * @Created by Administrator
 */

/*
* 动态规划问题求解问题解析：
* 假设我这里有1元，3元，5元的若干个硬币，此时需要凑够11元问最少需要多少个硬币
*
* */
public class Demo1_DP {
    // 用来计算需要n枚硬币的时候需要分别多少个1 3 5 的硬币
    public static void coins(int n){
        // 分治思想是从下而上的
        // 定义初始状态
        int[] state = new int[n+1];
        state[0] = 0;
        int[] money = {1,3,5};
        // 从初始状态一直计算到n状态，得出结果
        for (int i = 1; i <= n; i++) {
            // 记录是选用 1 3 5的哪一个，使用数组
            int[] temp = new int[3];

            for (int m = 0; m < money.length; m++) {
                if(i-money[m] >= 0){
                    temp[m] = state[i - money[m]] + 1;
                }else{
                    temp[m] = 100;
                }
            }

            // state[i] = 大于零中较小的数
            int min = temp[0];
            for (int index = 0; index < temp.length; index++) {
                if(temp[index] < min) min = temp[index];
            }
            state[i] = min;
        }

        System.out.println("当需要"+n+"枚硬币的时候需要的硬币排列最少是：");
        for (int i : state) {
            System.out.print(i+"\t");
        }
    }


    public static void main(String[] args) {
        coins(11);
    }
}
