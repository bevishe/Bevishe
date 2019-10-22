package com.cqupt.list;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2_Collection {

    /*
    *colleciton的常用方法
    * 1.add
    * 2.clear
    * 3.remove（）
    * isEmpty
    * contains
    * size
    * toArray
    *java.util.Collection接口
    * 所有单列结合的
    * */

    public static void main(String[] args) {
        // 多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法

        System.out.println(coll.add("张三"));
        coll.add("李四");
        coll.add("王五");

        coll.remove("张三");
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());
        System.out.println(coll.contains("赵六"));
        Object[] l = coll.toArray();
        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }

        System.out.println(coll);
        // 清除集合里面的元素，但是不删除集合
        coll.clear();
        System.out.println(coll.size());

    }
}