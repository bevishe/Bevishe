package com.cqupt.chapter6;

public class Student {
    String name;
    int age;

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");

    }

    public void study(){
        System.out.println("study");
    }

    public Student(){
        System.out.println("构造方法执行了！");
    }
}
