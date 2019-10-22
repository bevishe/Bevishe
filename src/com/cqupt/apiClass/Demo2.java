package com.cqupt.apiClass;

import java.util.ArrayList;

public class Demo2 {
    /*
    * 自动装箱与自动拆箱：基本数据和包装类之间的自动的相互转换
    * jdk1.5之后的新特性
    * 包装类无法直接参与运算
    *
    *
    * ArrayList集合无法直接存储整数类型，可以存储Integer包装类型（用到了自动装箱）
    * */

    public static void main(String[] args) {

        //自动装箱
        Integer i = 1;
        System.out.println(i);

        //自动拆箱
        int j = i + 2;
        System.out.println(j);

        i = j;


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    // 自动装箱
        int a = list.get(1); //自动拆箱
    }

}
