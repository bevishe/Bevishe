package com.guide;

import org.junit.Test;

import java.util.*;

public class Father {

    private String name;

    public Father(String name) {
        this.name = name;
    }

    public Father(){}



    // 为什么重写equals方法的时候一定要重写hashCode方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Father)) return false;
        Father father = (Father) o;
        return name.equals(father.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


    public static void main(String[] args) {
        Father father1 = new Father("hello");
        Father father2 = new Father("hello");
        System.out.println(father1 == father2);
        System.out.println(father1.equals(father2));


        // 如果不重写hashCode不能再hashSet里面识别father1和father2是同一个样本
        Set<Father> list = new HashSet<>();
        list.add(father1);
        list.add(father2);
        for (Father father : list) {
            System.out.println(father.name);
        }

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet.size());
        Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1!=null && o2 != null)
                    return o1-o2;
                else if(o1==null)
                    return -1;
                else if(o2 == null) return 1;
                else return 0;
            }
        });
        treeSet.add(null);
        System.out.println(treeSet.size());


    }
}
