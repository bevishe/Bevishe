package com.jvm;

/**
 * @Classname Demo1
 * @Description TODO
 * @Date 2020/3/3 17:11
 * @Created by Administrator
 */
public class Demo1 {


    // java中的常量池
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println("str1和str2"+(str1==str2));
        System.out.println("str1和str3"+(str1==str3));
        System.out.println("str2和str3"+(str2==str3));
        System.out.println("str3和str4"+(str3==str4));

    }
}
