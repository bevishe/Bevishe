package com.cqupt.chapter8;

/*
* 静态不能直接访问非静态
* 因为在内存中是先有的静态，后有的非静态
* 静态方法中不可以使用this，因为this代表的是当前对象
* */

public class Demo3_StaticMethod {
    public void method(){
        System.out.println("成员方法");
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("静态方法");
    }
}

class Demo3_Test{
    public static void main(String[] args) {
        Demo3_StaticMethod s = new Demo3_StaticMethod();
        s.method();
        Demo3_StaticMethod.methodStatic();

    }
}