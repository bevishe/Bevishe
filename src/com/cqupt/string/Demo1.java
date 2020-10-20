package com.cqupt.string;

public class Demo1 {

    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        String c = new String(new char[]{'a','b','c'});
        String d = new String("abc");
        String e = "abc";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(a == e);

        System.out.println('a');

        int[] bd = new int[3];
    }

}
