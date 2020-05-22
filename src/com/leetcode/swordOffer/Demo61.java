package com.leetcode.swordOffer;

import java.util.Arrays;

/**
 * @Classname Demo61
 * @Description TODO
 * @Date 2020/4/8 11:02
 * @Created by Administrator
 */
public class Demo61 {

    public boolean isStraight(int[] nums){
        int countQ = 0,needCount = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == 0) countQ ++;
            else{
                needCount += (nums[i+1]-nums[i]-1);
            }
        }
        System.out.println(countQ);
        return needCount <= countQ ? true : false;
    }

    public static void main(String[] args) {
        Demo61 demo61 = new Demo61();
        System.out.println(demo61.isStraight(new int[]{0,0,2,4,5}));
    }
}
