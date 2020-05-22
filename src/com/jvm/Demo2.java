package com.jvm;

/**
 * @Classname Demo2
 * @Description TODO * @Date 2020/3/3 19:07
 * @Created by Administrator
 */
public class Demo2 {


    //

    public Object re;

    public static int[] arr = new int[1024];

    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();

        d1.re = d2;
        d2.re = d1;

        System.gc();
    }
}
