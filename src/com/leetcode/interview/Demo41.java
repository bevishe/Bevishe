package com.leetcode.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo41 {


    // 找缺失的最小的正数

    // method1
    public int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        int re = 1;
        if(nums[nums.length -1] <= 0) return 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) continue;
            if(nums[i] == 1){
                while(i+1<nums.length && (nums[i+1] - 1 == nums[i] || nums[i+1] == nums[i])){
                    i++;
                }
                return i == nums.length -1 ? nums[i]+1:nums[i+1];
            }else{
                return 1;
            }
        }
        return re;
    }



    public static void main(String[] args) {

    }
}
