package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Classname demo3
 * @Description TODO
 * @Date 2020/2/14 11:44
 * @Created by Administrator
 */
public class demo3 {

    /**
     *  在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     *  数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
     *  请找出数组中任意一个重复的数字。
     *
     *
     * **/

    public static int findRepeatNumber(int[] nums){
        int[] arrs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrs[nums[i]] ++;
            if(arrs[nums[i]]>1) return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
