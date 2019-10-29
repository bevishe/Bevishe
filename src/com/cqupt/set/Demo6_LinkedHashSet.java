package com.cqupt.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo6_LinkedHashSet {
    /*
    * java.util.LinkedHashSet extends HashSet
    * LinkedHashSet:
    * 底层是一个hash表（数组+链表/红黑树）+链表：多了一条链表，（记录元素的存储有序）
    * */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("hello");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("hello");
        System.out.println(linkedHashSet);
    }
}
