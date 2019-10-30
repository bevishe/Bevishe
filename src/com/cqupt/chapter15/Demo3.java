package com.cqupt.chapter15;

public class Demo3 {

    public static void main(String[] args) {

        Outer.Inner i = new Outer().new Inner();
        i.method();
        System.out.println(i.num);
    }
}
