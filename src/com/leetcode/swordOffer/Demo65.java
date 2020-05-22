package com.leetcode.swordOffer;


/**
 * @Classname Demo65
 * @Description TODO
 * @Date 2020/4/7 16:24
 * @Created by Administrator
 */
public class Demo65 {

    // 异或运算得到的是无进位的和

    public int add(int a,int b){
        int sum,carry;

        while(b!=0){
            sum = a^b;

            carry = (int)(a&b) << 1;

            a = sum;
            b = carry;
        }
        return a;
    }



    public static void main(String[] args) {

        // 位运算
        int a = 12,b=1;
        System.out.println(a^a);
        System.out.println(a^b);
        System.out.println(b^b);
        System.out.println(a<<1);
    }
}
