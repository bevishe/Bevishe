package com.leetcode;

/**
 * @Classname Demo29
 * @Description TODO
 * @Date 2020/3/29 15:59
 * @Created by Administrator
 */


/*
*
*
* */

public class Demo29 {


    public static int divide(int dividend,int divisor){
        // 特殊情况
        // 2.除数等于零
        if(divisor == 0) System.out.println("不合法");
        // 1.被除数等于零
        if(dividend == 0) return 0;
        // 特殊情况，数值溢出情况

        // 确定符号
        int symbol = 1;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) symbol = -1;

        // 返回结果
        long re = 0,a ,b ;
        if(dividend == Integer.MIN_VALUE) a = (long)Integer.MAX_VALUE + 1;
        else a = Math.abs(dividend);
        if(divisor == Integer.MIN_VALUE) b = (long)Integer.MAX_VALUE + 1;
        else b = Math.abs(divisor);

        re = symbol == 1?div(a,b):0-div(a,b);
        return re > Integer.MAX_VALUE || re < Integer.MIN_VALUE ? Integer.MAX_VALUE : (int)re;
    }

    public static long div(long a,long b){
        // 跳出条件
        if(a < b) return 0;
        // 当次的商值
        long tb = b;
        long r = 1;
        while(a>b + b){
            r = r + r;
            b = b + b;
        }

        return r + div(a-b,tb);
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));


    }
}
