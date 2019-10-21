package com.cqupt.ApiDate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
成员方法：
String format(Date date)
Date parse(String source)

DateFormat是个抽象类
需要使用它的实现类SimpleDateFormat
* */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
    }

    //将日期格式化为文本
    public static void method1(){
        // 1.创建
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        String re = dateFormat.format(date);
        System.out.println(re);
    }

    //将文本解析成日期
    /*
    //注意：parse声明了一个异常，ParseException
    如果字符串和构造方法的模式不一样，那么程序就会抛出异常
    调用一个抛出异常的方法，就必须的处理这个异常，要么throws继续抛出这个异常，要么try catch自己来处理
    * */
    public static void method2() throws ParseException {
        //将符合模式的字符串解析成date
        String s = "2019-03-20 14:13:14";
        Date d = new Date();
        SimpleDateFormat sim = new SimpleDateFormat();
        d = sim.parse(s);
        System.out.println(d);
    }
}
