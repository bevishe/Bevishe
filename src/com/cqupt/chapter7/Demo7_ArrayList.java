package com.cqupt.chapter7;

import java.util.ArrayList;

public class Demo7_ArrayList {
    //ArrayList集合的长度是可以随意变化的
    //对于ArrayList来说有一个尖括号，代表泛型，
    //也就是装在集合当中所有的元素，全部都是统一的什么类型
    //注意泛型只能是引用类型，不能是基本类型，从jdk1.7开始，右侧的尖括号内可以不用谢内容，但是<>必须写

    /*
    * 对于ArrayList集合来说，直接打印不是地址值，而是内容
    * 如果内容是空，得到的是空的中括号【】
    *
    * 对于ArrayList集合add一定成功
    * 而对于其他的集合使用add不一定成功
    * */

    public static void main(String[] args) {
        ArrayList<Person> array = new ArrayList<>();
        array.add(new Person("jack",23));
        System.out.println(array.get(0).getName());

        ArrayList<Integer> listb = new ArrayList<>();
        listb.add(100);
        listb.add(200);
        for (int i = 0; i < listb.size(); i++) {
            System.out.println(listb.get(i));
        }
    }
}
