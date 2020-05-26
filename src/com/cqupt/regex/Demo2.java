package com.cqupt.regex;

import org.omg.PortableServer.POA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {


    public void method1(){
        String s = "I am ok,my name is bevis";
        String pattern = ".*my.*";
        boolean hava = Pattern.matches(pattern,s);
        System.out.println(hava);
    }


    public void method2(){
        String s = "1-2-1---1-12-122safa";
        String p = "(\\d+).*(\\d+)";
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        // match.group() 中匹配的是pattern中的元组未知，当group（0） 是原字符串
        if(matcher.find()){
            System.out.println(matcher.group().length());
            String arr = matcher.group();
            System.out.println(arr);
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }


    public void method3(){
        String s = "1-2--21--12-12-1-2-1";
        String regex = "-+";
        String[] arr = s.split(regex);
        System.out.println(arr.length);
        for (String s1 : arr) {
            System.out.println(s1);
        }

    }

    /*
    * Pattern 模式类
    * Matcher 匹配器类，没有构造方法需要使用patter类中的matcher方法返回一个匹配器类的对象
    *
    * */

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        // 搜索当前字符串是否存在需要匹配的
        demo2.method1();

        // 找出字符串中的匹配子串
        demo2.method2();

        demo2.method3();
    }
}
