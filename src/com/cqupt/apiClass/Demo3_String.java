package com.cqupt.apiClass;

public class Demo3_String {
    /*
    * 基本类型与字符串类型之间的相互转换
    * 基本类型-》字符串（String）
    *   1.基本数据类型+“”
    *   2.包装类型的静态方法toString（参数）方法，不是Object类的toString（）方法，方法重载
    *   3.String类的静态方法，valueOf（基本数据类型）
    *
    *
    * 字符串-》基本数据类型
    *   1.使用包装类的parseXXX（数值类型的字符串）；
    *       Integer类：static int parseInt（String s）
    *       Double类：
    * */

    public static void main(String[] args) {
        // 基本数据类型变为字符串
        int i = 100;
        String s1 = i + "";
        String s2 = Integer.toString(i);
        String s3 = String.valueOf(i);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //字符串变为基本数据类型
        String s = "100";
        int a = Integer.parseInt(s);
        System.out.println(a);




    }
}
