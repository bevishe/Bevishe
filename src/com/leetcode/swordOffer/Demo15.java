package com.leetcode.swordOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Classname Demo15
 * @Description TODO
 * @Date 2020/3/5 11:20
 * @Created by Administrator
 */
public class Demo15 {
    /*
    * 考察十进制如何变为2进制
    * 正整数：除2取余，倒数排列
    * 负数：先按正整数取二进制，然后按位取反，最后加一'
    * */

    public static int hammingWeight(int n){
        int res = 0;
        while(n!=0){
            if(n>>>1 == 1) res++;
        }
        return res;
    }

    public static void main(String[] args) {
//        int i = hammingWeight(23);
        int a = -15;
        System.out.println(a>>>1);
        System.out.println(a>>>2);
        System.out.println(a>>>3);
        System.out.println(a>>>4);


    }


}
