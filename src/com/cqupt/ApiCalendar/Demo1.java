package com.cqupt.ApiCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo1 {
    //这是一个抽象类，里面提供了很多操作日历的方法

    public static void main(String[] args) {
        //多态
        Calendar g = Calendar.getInstance();
        System.out.println(g);
        //获取字段
        System.out.println(g.get(Calendar.YEAR));
        System.out.println(g.get(Calendar.MONTH));
        System.out.println(g.get(Calendar.DAY_OF_MONTH));
        System.out.println(g.get(Calendar.HOUR));
        System.out.println(g.get(Calendar.MINUTE));

        //设置字段
        g.set(Calendar.YEAR,2011);
        System.out.println(g.get(Calendar.YEAR));

        g.set(2099,10,12);
        System.out.println(g.get(Calendar.YEAR));
        System.out.println(g.get(Calendar.MONTH));
        System.out.println(g.get(Calendar.DAY_OF_MONTH));
    }
}
