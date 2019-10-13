package com.cqupt.chapter7;

/*
Random 用来生成随机数字
* * */

import java.util.Random;

public class Demo5_Random {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println(a);
    }
}
