package com.cqupt.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    // 泛型
    /*
    * ArrayList集合在定义的时候，不知道集合中都会存储什么数据类型，所以类型使用泛型
    * 在创建对象的时候，会确定泛型的数据类型，会把数据类型作为参数类型传递，赋值给泛型
    * 在不确定数据类型
    * */

    public static void main(String[] args) {
//        show1();
        show2();
    }


    /*
    * 创建集合对象不使用泛型
    * 好处：集合不使用泛型，默认的数据类型是Object类型
    * 弊端：不安全，会引发异常
    * */

    private static void show1(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        Iterator i = list.iterator();
        while(i.hasNext()){
            // 存储进集合是Object类型，取出的数据类型也是Object数据类型
            Object obj = i.next();
            System.out.println(obj);

            // 想要使用String类特用的方法，length获取字符串长度，不能使用
            String s = (String)obj;
            // 会抛出异常 ，不能直接将Integer类型转换成字符串数据类型
            System.out.println(s.length());
        }
    }

    /*
    * 创建集合使用泛型：
    * 好处：1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    *      2.把运行期异常，提升到了编译期
    * 弊端：1.泛型是什么类型，就只能存储什么类型的数据了
    * */
    private static void show2(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("12123");
//        arrayList.add(12);

        Iterator<String> i = arrayList.iterator();
        while(i.hasNext()){
            System.out.println(i.next().length());
        }

    }
}
