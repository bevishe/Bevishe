package com.cqupt.apiDate;

import java.util.Date;

public class Demo2_Date {

    public static void main(String[] args) {
        method();
        method2();
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        //将日期转换成毫秒
        long a = date.getTime();
        System.out.println(a);
    }

    private static void method(){
        Date date = new Date();
        System.out.println(date);
    }


    // 带参数的
    private static void method2(){
        Date date = new Date(1571151683869l);//0毫秒的日期数
        System.out.println(date);
    }
}
