package com.cqupt.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo5_HashTable {
    /*
    * java.util.HashTable implements Map<k,v>
    * 不允许存储空
    * 特点：
    *   HashTable：底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    *   HashMap：底层是一个哈希表，是一个线程不安全的集合，多线程集合，速度快
    *
    *   HashMap（），可以存储NULL值NULL键
    *   HashTable：不能存储NULL值，NULL键
    *
    *   HashTable和Vector集合一样，在jdk1.2之后就被更加先进的集合（HashMap，ArrayList）取代了
    *   HashTable的子类Properties依然活跃到历史舞台
    *   Properties集合是唯一一个和IO流向相结合的集合
    *
    *
    **/

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        // hashTable中存储null键值的时候会出现空指针异常
        Hashtable<String,String> hashtable = new Hashtable<>();
        //hashtable.put(null,"a");
        System.out.println(hashtable);
    }

}
