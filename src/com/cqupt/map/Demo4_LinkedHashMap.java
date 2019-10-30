package com.cqupt.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo4_LinkedHashMap {

    /*
    * java.util.LinkedHashMap<k,v> extends HashMap<K,v>
    map接口的哈希表和链表实现，是有序的键值对
    *底层原理：
    * 哈希表+链表（记录元素的顺序）
    * */
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("c","c");
        hashMap.put("a","d");
        System.out.println(hashMap);


        // LinkedHashMap是有序的
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("b","b");
        linkedHashMap.put("c","d");
        linkedHashMap.put("c","d");
    }
}
