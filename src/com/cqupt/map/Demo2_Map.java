package com.cqupt.map;

import java.util.*;

public class Demo2_Map {
    // 对map集合进行遍历
    /*
    *Entry键值对对象：
    * 在Map接口中内部有个内部接口Entry
    * 作用：当Map集合一创建，就会在map集合中创建一个entry对象，用阿里记录键和值
    *
    * */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",18);
        map.put("mary",19);
        map.put("rose",12);

        // 返回key的一个set集合，进而来遍历map集合
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }
        System.out.println("************************************************");

        // map集合遍历的第二种方式：
        /*
        * 实现步骤：
        * 1.使用map集合中的entry方法，把map集合中的entry对象取出来放到set集合中
        * 2.遍历set集合，获取每一个entry对象
        * 3.使用entry对象中的方法，getKey（）和getValue（）
        * */
        // 使用entry方法来遍历Map集合
        Set<Map.Entry<String,Integer>> set1 = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set1.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> men = iterator.next();
            System.out.println(men.getKey());
            System.out.println(men.getValue());
        }
    }
}
