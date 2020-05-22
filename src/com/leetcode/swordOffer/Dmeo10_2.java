package com.leetcode.swordOffer;

/**
 * @Classname Dmeo10_2
 * @Description TODO
 * @Date 2020/2/17 17:11
 * @Created by Administrator
 */

public class Dmeo10_2 {

    public static int numWays(int n){
        // 求跳2级的有几种
        int maxSize = 0,sum = 0;
        if(n==1 || n==2) return 1;
        else{
            if(n%2==0)
                maxSize = n/2 - 1;
            else
                maxSize = n/2;
        }
        for (int i = 1; i <= maxSize; i++) {
//            System.out.println(n-i*2);
//            System.out.println(n(n-i*2));
//            System.out.println(n(i));
            sum += (n(n-i)/(n(n-i*2)*n(i)));       // c n maxSize
        }
        return sum % 1000000007;
    }

    public static int n(int n){
        long re=1;
        if(n==1) return 1;
        else{
            for (int i = 1; i <=n; i++) {
                re = re * i;
                re = re % 1000000007;
            }
        }
        return (int)re;
    }

    public static void main(String[] args) {
        System.out.println(numWays(43));
    }
}
