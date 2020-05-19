package com.leetcode.swordOffer;

import java.util.Arrays;

/**
 * @Classname Demo57_1
 * @Description TODO
 * @Date 2020/4/9 10:08
 * @Created by Administrator
 */
public class Demo57_1 {

    public int[] twoSum(int[] nums,int target){
        if(nums == null || nums.length == 1|| nums.length == 0)  return null;
        Arrays.sort(nums);
        int sum = nums[0] + nums[nums.length - 1];
        for (int l = 0 , r = nums.length - 1; l<r ;) {
            if(sum > target){
                sum += (nums[r-1] - nums[r]);
                r--;
            }else if(sum < target){
                sum += (nums[l+1] - nums[l]);
                l++;
            }else{
                return new int[]{nums[l],nums[r]};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }
}
