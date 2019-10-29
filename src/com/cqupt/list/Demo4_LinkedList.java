package com.cqupt.list;

import java.util.LinkedList;
import java.util.List;

public class Demo4_LinkedList {

    /*
    * 使用多态的时候是看不到子类特有的方法
    * LinkedList:
    * 是用链表实现的，增删快，查询慢
    * 有很多方法用来操作集合的第一和最后一个元素
    *   pop（）等效于removeFirst
    *   push（）
    * */


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        list.push("first");
        System.out.println(list);

        String s = list.pop();
        System.out.println(s);
        System.out.println(list);

        list.addFirst("addFirst");
        list.addLast("addLast");
        System.out.println(list);

        method1();
    }

    public static void method1(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // 清空集合中的元素
//        list.clear();
        // 当集合中的元素为空的时候不可以getFirst getLast

        //需要判断LinkedList是否为空
        if(!list.isEmpty()){
            String first = list.getFirst();
            System.out.println(first);

            String last = list.getLast();
            System.out.println(last);
        }
    }

    private static void method2(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);

        //移除LinkedList第一个元素
        if (!list.isEmpty()){
            list.removeFirst();
        }

        // 移除LinkedList最后一个元素
        if(!list.isEmpty()){
            list.removeLast();
        }
    }
}
