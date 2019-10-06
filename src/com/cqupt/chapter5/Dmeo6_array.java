package com.cqupt.chapter5;

import sun.awt.windows.WPrinterJob;

public class Dmeo6_array {


    /*
    数组初始化两种方式：
    1.动态初始化：（指定长度）
    在创建数组的时候直接指定数组中的数据元素个数
    2.静态初始化：（指定内容）
    直接将具体的数据内容进行指定
    数据类型【】 数据名称 = new 数据类型【】{元素1，元素2，...}；
    * */
    /*
    * 注意事项：
    * 1.静态初始化标准格式可以拆分成两个部分
    * 数据类型【】 数据名称；
    * 数据名称 = new 数据类型【】 {}；
    *
    * 2.动态初始化也可以拆分成两个步骤:
    * int[] arrayA;
    * arrayA = new int[5];
    *
    * 静态初始化一旦使用省略格式不可以拆分成两个部分；
    *
    * 动态初始化默认值
    * int 0
    * double 0.0
    *char \u0000
    * boolean false
    * 引用类型 null
    * 静态初始化其实也有默认值，只不过系统自动将默认值替换成大括号中的具体内容
    * */

    public static void main(String[] args) {
        int[] a = new int[4];
        System.out.println(a[1]);
        System.out.println(a.length);
        a[1] = 12;
    }

}
