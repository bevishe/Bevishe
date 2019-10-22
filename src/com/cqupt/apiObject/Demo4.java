package com.cqupt.apiObject;

public class Demo4 {

    public static void main(String[] args) {
        Demo3_Equal d1 = new Demo3_Equal("hello",12);
        Demo3_Equal d2 = new Demo3_Equal("hello",12);

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
    }
}
