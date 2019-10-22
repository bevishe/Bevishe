package com.cqupt.apiDate;

import sun.awt.windows.WPrinterJob;

import java.util.Date;

public class Demo1_Data {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //当前系统时间和时间元点之间的毫秒数
        //注意中国属于东八区，时间会增加8个小时
        System.out.println(System.currentTimeMillis());
    }
}
