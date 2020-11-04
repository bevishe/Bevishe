package com.thinkInJava.chapter10;

import com.cqupt.threadState.BaoZi;

abstract class Base{

    public Base(int i) {
        System.out.println("this is Base Constructor :"+i);
    }


    public abstract void f();
}

class AnonymousConstructor{

    // 此处的i不是传递给匿名内部类中的变量的，所以不需要对i进行final的修饰
    public static Base getBase(int i){
       return new Base(i) {
           {
               System.out.println("内部类中的 insttance initializer");
           }

           @Override
           public void f() {
               System.out.println("内部类的函数f");
           }
       };
    }

    public static void main(String[] args) {
        Base base = getBase(1);
        base.f();
    }
}

public class Demo2 {

    public static void main(String[] args) {

    }
}
