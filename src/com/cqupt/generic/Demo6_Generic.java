package com.cqupt.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo6_Generic {

    /*
    * 泛型的通配符
    * ？
    * 使用方式：
    * 不能创建对象使用
    * 只能作为方法的参数使用
    * */

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        method(list01);
        method(list02);


    }

    /*
    定义一个方法，能遍历所有类型的Arraylist集合，但是我们不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符?来接受数据类型
    注意：泛型还是没有继承概念的
    * */
    private static void method(ArrayList<?> arrayList){
        Iterator<?> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
