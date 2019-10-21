package com.cqupt.apiStringBuilder;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("hello,world!");
        sb.append("java");
        System.out.println(sb);
        String s1 = sb.toString();
        String s2 = sb.substring(6);
        System.out.println(s1);
        System.out.println(s2);
    }
}
