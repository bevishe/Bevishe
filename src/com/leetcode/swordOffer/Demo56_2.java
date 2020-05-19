package com.leetcode.swordOffer;

import java.util.Arrays;

/**
 * @Classname Demo56_2
 * @Description TODO
 * @Date 2020/4/9 16:24
 * @Created by Administrator
 */
public class Demo56_2 {


    public int singleNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) i+= 2;
            else return nums[i];
        }
        return nums[nums.length -1];
    }


    public static void main(String[] args) {

    }
}
