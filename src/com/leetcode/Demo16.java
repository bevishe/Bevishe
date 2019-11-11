package com.leetcode;

import java.util.Arrays;

public class Demo16 {

    /*
    *给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
    例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
    与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
    * */

    /*
    *
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 排序
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的
                    return target;
                }

            }

        }

        return closestNum;
    }
}
     * */

    public static int threeSumClosest(int[] nums, int target) {
        int threeSum;
        threeSum = nums[0] +nums[1]+nums[nums.length-1];
        if(nums.length == 3) return threeSum;
        int second,third;
        for (int first = 0; first < nums.length-2; first++) {
            second = first++;
            third = nums.length - 1;
            int temp = nums[first] + nums[second] +nums[third];
            if(temp == target) return target;
            else if(temp - target>0){

            }
        }

        return threeSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        int i = threeSumClosest(nums,-100);
        System.out.println(i);
    }
}