package com.cqupt.chapter9;

public class Demo2_ExtendsField {
//当使用成员方法时，优先看方法属于谁，就优先访问谁，否则往上找
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numzi);

        System.out.println(fu.num);
        System.out.println(zi.num);

        System.out.println("++++++++++++++++++++");
        fu.methodFu();
        zi.methodZi();
        zi.methodFu();
    }
}
