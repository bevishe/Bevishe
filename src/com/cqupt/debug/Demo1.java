package com.cqupt.debug;

public class Demo1 {
    /*
    *
    * Debug调试程序；
    *   可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
    * 使用方法：
    *   哪里不会点哪里，右键debug执行程序
    *   f8 逐行执行程序
    *   f7 进入到方法中
    *   shift + f8 跳出方法
    *   f9 跳到下一个断点
    *   ctrl + f2 退出debug模式，停止程序
    * */

    public static void main(String[] args) {
        int a =10;
        int b = 23;
        int sumAB = a + b;
        System.out.println(sumAB);
        for (int i = 0; i < 12; i++) {
            System.out.println("hello");

        }
    }

}
