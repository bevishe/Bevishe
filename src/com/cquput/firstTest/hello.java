package com.cquput.firstTest;


public class hello {


/**
 数据类型
 1.基本数据类型：
    1.数值型：
        1.整型：byte,short,int,long
        2.浮点型：float,double
        (1) int = int + byte (在数值型运算时，自动类型提升)
        (2) byte b = 1
            b = b + 1 （会出错误）
            （因为在b的值不确定，自动转换的时候可能会丢失精度,需要进行强制类型转换）
    2.字符型:char（两字节）
            （ASSII American Standard Code for Information Interchange）
    3.布尔型:boolean
 2.引用数据类型：
    1.类：class
    2.接口：interface
    3.数组：[]

 运算符：
 1.算术运算符
 + - % / ++ --
    1. ++
 2.逻辑运算符
    & | ！^(异或) && || 用来连接两个boolean型表达式
 3.比较运算符 结果要吗为false要么为true

*/
    public static void main(String[] args) {
        System.out.println("hello world");
        byte b = 1;
        b = (byte)(b + 1);
        System.out.println(b);
        System.out.println(2%-5);
        short bc = 1;
        short bb =127;
    }
}
