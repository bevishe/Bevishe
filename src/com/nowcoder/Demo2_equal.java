package com.nowcoder;

public class Demo2_equal {

    public static void main(String[] args) {

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);


        String a = "hello";
        String b = "hello";
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
