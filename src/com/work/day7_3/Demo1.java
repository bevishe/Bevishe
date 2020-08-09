package com.work.day7_3;

import java.util.ArrayList;

public class Demo1 {


    static void print(ArrayList al){
        al.add(2);
        al = new ArrayList();
        al.add(3);
        al.add(4);

    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        ArrayList al = new ArrayList();
        al.add(1);
        print(al);
        System.out.println(al.get(1));
    }
}
