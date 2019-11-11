package com.cqupt.recursive;

public class Demo2 {

    /*
    * 使用递归来计算1-n的和
    * */

    public static void main(String[] args) {
        int s =0;
        s = addN(100);
        System.out.println(s);
    }

    private static int addN(int n){
        if(n==1) return 1;
        return n + addN(n-1);
    }
}