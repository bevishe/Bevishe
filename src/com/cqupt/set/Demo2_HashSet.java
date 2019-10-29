package com.cqupt.set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo2_HashSet {

    /*
    *
    * Set接口的实现类集合
    * HashSet implement Set
    * 特点：
    * 1.不允许存储重复元素
    * 2.没有索引
    * 3.是一个无序集合，存储取出元素的顺序不同
    * 4.底层是一个hash表结构
    *
    *
    * */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("jack");
        hashSet.add("rock");
        hashSet.add("mark");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add("f");
        hashSet.add("g");

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String s:hashSet){
            System.out.println(s);
        }
    }

}
