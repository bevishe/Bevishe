package com.cqupt.apiStringBuilder;

public class Demo2_StringBuilder {

    /*
    * StringBuilder常用方法
    *
    * */

    public static void main(String[] args) {
        System.out.println("hello");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");

        //append 方法返回的是this，调用方法的对象sb，this==sb
        System.out.println(sb);
        System.out.println(sb2);
        // 对于引用数据类型而言==比较是地址值
        System.out.println(sb==sb2);

        //使用append方法无需接收的返回值
        sb.append("abc");
        sb.append(1);
        sb.append(true);
        sb.append("a");
        System.out.println(sb);

        /*链式编程
        * 方法返回值是一对象，可以继续调用对象
        * */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
    }
}
