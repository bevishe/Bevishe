package com.cqupt.generic;

public class Demo2_GenericClass {
    public static void main(String[] args) {
        GenericClass g = new GenericClass();
        g.setName("hello");
        System.out.println(g.getName());


        GenericClass<Integer> g2 = new GenericClass<>();
        g2.setName(12);
        System.out.println(g2.getName());
        System.out.println(g2.getName()+2);
    }
}
