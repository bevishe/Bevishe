package com.cqupt.set;

import java.util.HashSet;

public class Demo4_Set {

    /*
    * Set集合不允许重复元素的原理
    * Set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
    * add的使用步骤：
    * 1.首先调用添加元素的hashCode方法，取得hash值，看集合中是否存在该hash值的元素
    * 2.若不存在，直接添加进集合中；若存在，则再比较元素的equal方法比较是否元素是否相同
    * 3.如相同则不存集合，否则存入集合中去
    *
    *
    * Set集合报错元素唯一：
    * 存储的元素必须重写hashCode（）和equal（）
    *
    * */

    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
