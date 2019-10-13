package com.cqupt.chapter7;

public class Demo8_String {
    /*
    * String特点：
    * 1.字符串的内容不可改变，创建之后不可更改
    * 2.正因为字符串不可改变，所以字符串是可以共享使用的
    * 3.字符串效果上相当于char【】，但是底层原理是byte【】数组
    *
    *
    * 创建字符串的4中方法：
    * 1.pulic String（）创建空字符串
    * 2.public String（char【】 array）
    * 3.pulic String（byte【】 array）
    * 4.直接创建
    * */

    public static void main(String[] args) {
        String a = new String();
        System.out.println(a);

        String b = new String(new char[]{'a','b','c'});
        System.out.println(b);

        byte[] byteArray = {97,98,99,100};
        String c = new String(byteArray);
        System.out.println(c);

    }
}
