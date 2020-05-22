package com.leetcode.swordOffer;

import java.util.Arrays;

/**
 * @Classname Demo66
 * @Description TODO
 * @Date 2020/4/7 14:26
 * @Created by Administrator
 */
public class Demo66 {

    public int[] constructArr(int[] a){
        if(a == null || a.length == 0) return new int[0];
        int[] b = new int[a.length];
        Arrays.fill(b,1);


        //使用双向遍历
        int val = 1;
        for (int i = 0; i < a.length-1; i++) {
            b[i+1] = val*a[i];
            System.out.println(b[i+1]);
            val = b[i+1];
        }

        //从后到前
        val = 1;
        for (int j = a.length - 1;j>0;j--) {
            b[j-1] = b[j]*val*a[j];
            val *= a[j];
        }

        return b;
    }


    public static void main(String[] args) {

    }
}
