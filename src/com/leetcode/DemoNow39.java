package com.leetcode;

        import java.util.Arrays;

public class DemoNow39 {

    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    // 摩尔投票法
    public int method(int[] nums){
        int x = 0,vnote = 0;
        for (int num : nums) {
            if(vnote == 0) x = num;
            vnote += num == x ? 1:-1;
        }
        return x;
    }

    public static void main(String[] args) {

    }
}
