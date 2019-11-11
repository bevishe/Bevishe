package com.cqupt.recursive;

public class Demo3 {
    // 计算阶乘
    public static void main(String[] args) {
        int n = matN(10);
        System.out.println(n);
    }

    private static int matN(int n){
        if(n==1) return 1;
        return n*matN(n-1);
    }
}
