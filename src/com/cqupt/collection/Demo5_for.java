package com.cqupt.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo5_for {

    //增强for循环，专门用来遍历数组和集合
    /*
    * 底层使用的就是迭代器：使用for循环的格式，简化迭代器的书写
    * jdk1.5之后的新特性
    * 格式：
    *   for（集合、数组的数据类型 变量名：集合名、数据名）{
    *       System.out.println(变量名);
    * }
    * */

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        // 底层也是用迭代器实现的
        for(String a:coll){
            System.out.println(a);
        }
    }
}
