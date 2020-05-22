package com.cqupt.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname Demo1
 * @Description TODO
 * @Date 2020/4/8 21:20
 * @Created by Administrator
 */
public class Demo1 {

    public void method1(){
        // 创建表达式对象
        Pattern pattern = Pattern.compile("\\S+");
        // 创建matcher对象
        Matcher matcher = pattern.matcher("hello are you  !");
        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.method1();
    }
}
