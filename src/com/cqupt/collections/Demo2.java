package com.cqupt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
*
*
* compareable 和 Comparator的区别：
* Compareable：自己和别人比较，自己需要实现Compareable接口，重写compareTo方法
* Comparator：相当于找一个第三方的裁判，比较两个
* Comparator排序规则：o1-o2升序
* */

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("jack",12));
        list.add(new Person("mark",15));
        list.add(new Person("mary",10));


        // 实现一个实现了接口Comparator接口的匿名内部类
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);

     }
}