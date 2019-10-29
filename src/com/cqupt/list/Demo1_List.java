package com.cqupt.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1_List {
    /*
    * java.util.List接口 extends Collection
    * List接口的特点：
    * 1.有序的集合，存储元素和取出元素的顺序是一致的
    * 2.有索引，
    * 3.允许存储重复的元素
    *
    * */

    public static void main(String[] args) {
        // 创建List集合对象，多态
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list); // 不是地址重写了toString方法

        // 使用普通for循环来遍历list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 使用迭代器来遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //使用增强for循环遍历
        for(String s:list){
            System.out.println(s);
        }

        // 在bc之间添加hello
        list.add(2,"hello");
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.remove(2));

        // 返回被替换的元素
        System.out.println(list.set(3,"c"));
        System.out.println(list);


    }
}