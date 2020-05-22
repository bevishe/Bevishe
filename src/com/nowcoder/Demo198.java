package com.nowcoder;

/**
 * @Classname Demo198
 * @Description TODO
 * @Date 2020/3/19 15:54
 * @Created by Administrator
 */

/*
*
* 动态规划问题：
* 现有数组 【12,32,121,1】
* 里面的数字代表在该房子里面可以抢到的钱数，现需要不间隔的抢劫这些方法，求可以抢的最多钱是多少
* */
public class Demo198 {
    public static int maxMoney(int[] nums){
        // 状态数组
        int[] state = new int[nums.length];
        state[0] = nums[0];
        if(nums.length<=1) return state[0];
        else{
            state[1] = Math.max(nums[0],nums[1]);
            // 动态规划是自底向上来设计的
            // 从状态k-2一直计算到状态n
            for(int i = 2;i <= nums.length -1 ;i++){
                state[i] = Math.max(state[i-2]+nums[i],state[i-1]);
            }
            return state[nums.length-1];
        }
    }

    public static void main(String[] args) {
        System.out.println(maxMoney(new int[]{1,2,3,1}));
    }
}
