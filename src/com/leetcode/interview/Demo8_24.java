package com.leetcode.interview;

import java.util.ArrayList;

public class Demo8_24 {
    /**
     * 问题：求取给给出的一个数值中，元素中的数值有正有负，最大的子数组和是多少？
     *
     * **/


    public static void method(int[] arr){
        /**
         * 方法1：使用暴力的方法
         * */
        int sum = 0,max = 0;
        // 子序列开始的索引下标位置
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            // 从i开始的子序列，长度依次增加
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                max = Math. max(max,sum);
            }
        }
        System.out.println(max);
    }

    public static void method2(int[] arr){

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,1,12,-12,12,-1,3,5,-1,8,2,-5,-5,9};
        method(arr);

        ArrayList<String> list = new ArrayList<>();

        System.out.println(Integer.valueOf(0) == Integer.valueOf(0));



    }

}
