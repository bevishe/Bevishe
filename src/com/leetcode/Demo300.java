package com.leetcode;

/**
 * @Classname Demo300
 * @Description TODO
 * @Date 2020/3/20 9:12
 * @Created by Administrator
 */

/*
* 最长上升子序列
*
* */

public class Demo300 {

    public static int lengthOfLIS(int[] nums){
        // 使用动态规划的思想
        // 动态规划是从低向上设计的，重点是找到特征转移方程

        // 设置状态数组
        int[] pd = new int[nums.length];
        pd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            // 找到最大的pd【j】
            int maxPd = 0,maxj = -1;
            for (int j = 0; j < i; j++) {
                if(nums[j] <= nums[i] && maxj == -1) {maxPd=pd[j]; maxj = j;}
                else if(maxj != -1 && pd[j]>maxPd && nums[j] <= nums[i]) {maxPd = pd[j]; maxj = j;}
            }
            pd[i] = maxj != -1 ? pd[maxj] +1:1;
        }

        int max = pd[0];
        for (int i = 0; i < pd.length; i++) {
            if(pd[i]> max) max = pd[i];
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}



