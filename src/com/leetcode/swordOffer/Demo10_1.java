package com.leetcode.swordOffer;

/**
 * @Classname Demo10_1
 * @Description TODO
 * @Date 2020/2/17 16:44
 * @Created by Administrator
 */
public class Demo10_1 {
    // 斐波那契数列

    public static int fib(int n){
        return fibGetN(n)%(1000000007);
    }

    public static int fibGetN(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibGetN(n-1) + fibGetN(n-2);
    }


    // 非递归的方法
    public static int fibPlus(int n){
        if(n==0) return 0;
        else if(n == 1) return 1;
        int first = 0,second = 1,third=0;
        for (int i = 2; i <= n; i++) {
            third = first + second;

            first = second;
            second = third;
        }
        return third%1000000007;
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fibPlus(48));
        System.out.println(fibGetN(48));
    }



}
