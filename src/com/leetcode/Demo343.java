package com.leetcode;

/**
 * @Classname Demo343
 * @Description TODO
 * @Date 2020/3/24 11:53
 * @Created by Administrator
 */

/*
* 整数拆分
*
* */
public class Demo343 {

    public static int integerBreak(int n){

        return 0;
    }


    // 使用贪心算法
    public static int method2(int n){
        if(n == 1 || n ==2) return 1;
        else if(n == 3) return 2;
        else{
            int c = n / 3, d = n % 3,re = 1;

            if(d == 1){
                while(c>1) {re *= 3; c--;}
                return re*4;
            }else if(d==2){
                while(c>0) {re *= 3; c--;}
                return 2*re;
            }else{
                while(c>0){re *= 3;c--;}
                return re;
            }
        }
    }

    public static void main(String[] args) {

    }
}
