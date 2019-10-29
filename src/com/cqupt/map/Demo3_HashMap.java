package com.cqupt.map;

import java.util.HashMap;
import java.util.Set;

public class Demo3_HashMap {
    /*
    * HashMap存储自定义类型键值对
    * Map集合保证key唯一：
    *   作为key的元素，必须重写hashCode方法和equals方法，保证key唯一
    * */

    public static void main(String[] args) {
        show1();
        System.out.println("***********************************************");
        show2();
    }


    /*
    * HashMap存储自定义类型键值
    * key：string
    * value：Person
    * */
    private static void show1(){
        HashMap<String,Person> hashMap = new HashMap<>();
        hashMap.put("北京",new Person("张三",18));
        hashMap.put("上海",new Person("李四",14));
        hashMap.put("武汉",new Person("王五",16));
        hashMap.put("北京",new Person("赵六",19));

        // 遍历hashMap
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s + "->" + hashMap.get(s));
        }
    }

    /*
    *
    *
    * */
    private static void show2(){
        HashMap<Person,String> hashMap = new HashMap<>();
        hashMap.put(new Person("张三",12),"北京");
        hashMap.put(new Person("赵四",13),"武汉");
        hashMap.put(new Person("王五",14),"广州");
        hashMap.put(new Person("张三",12),"武汉");

        // 遍历hashmap
        Set<Person> set = hashMap.keySet();
        for (Person person : set) {
            System.out.println(person+"->"+hashMap.get(person));
        }
    }
}
