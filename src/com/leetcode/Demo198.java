package com.leetcode;


import java.util.Scanner;

public class Demo198 {


    public static int rob(int[] nums) {
        if(nums.length ==0) return 0;
        // 状态数组
        int[] state = new int[nums.length];
        state[0] = nums[0];
        if(nums.length ==1) return state[0];
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

        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().trim().split(",");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        rob(arr);
    }
}
