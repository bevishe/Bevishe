package com.cqupt.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3_Iterator{
    /*
    * 迭代器：
    * hasNext
    *
    * next
    *
    * Iterator:迭代器是一个接口，无法直接使用功能，需要使用Iterator的实现类对象，获取实现类的对象比较特殊
    * Collection 接口中有一个方法，iterator，返回一个迭代器对象
    *
    * 迭代器使用步骤：
    * 1.使用集合中的iterator（）获取迭代器的实现类对象，使用Iterator接口来接受（多态）
    * 2.使用Iterator接口中的方法hasNext判断是否具有下一个对象
    * 3.使用Iterator接口中的next取出下一个元素
    * */

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        Iterator<String> iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Iterator<String> it2= coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);

        }
    }
}