package com.cqupt.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    /*
    *Map集合：双列集合
    *Map<k,v>  k不可以重复
    *
    *Map集合的特点：
    * 1.是个双列集合，一个元素包含两个值，key，value
    * 2.Map集合中的元素，k和v的数据类型可以是相同的，也可以不同
    * 3.Map集合中的k是不允许重复的的，v可以重复
    * 4.k和v是一一对应的
    *
    *java.util.HashMap集合 implements Map<K,V>
    HashMap的特点：
    * 1.底层是哈希表：查询速度特别快
    *   jdk1.8之前：数组+单向链表
    *   jdk1.8之后：数组+单向链表（或者红黑树），链表的长度超过8时，用红黑树，提高查询速度
    * 2.是个无序集合，
    *
    * java.util.LinkedHashMap
    * LinkedHashMapde特点：
    * 1.底层是hash表+链表（保证迭代的顺序）
    * 2.是个有序的集合
    *
    *
    * Map接口中的方法：
    * 1.put（k，v） 添加元素
    * 2.get（k） 通过k来获取value值
    * 3.remove（k） 通过k来删除元素
    * 4.containsKey（k） 判断集合中k是否在keys中
    * 5.set（）
    * 6.
    *
    * */

    public static void main(String[] args) {

        show1();
        show2();
    }

    private static void show1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",12);
        map.put("jack",14);
        map.put("mary",12);
        System.out.println(map);
    }

    private static void show2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",12);
        map.put("jack",14);
        map.put("mary",12);
        System.out.println(map);
        map.remove("jack");
        System.out.println(map);

    }
}
