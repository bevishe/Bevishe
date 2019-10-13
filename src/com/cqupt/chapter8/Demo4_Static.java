package com.cqupt.chapter8;

public class Demo4_Static {
    // 静态代码块
    static {
        System.out.println("静态代码块执行！");
    }


    public Demo4_Static(){
        System.out.println("构造方法执行");
    }
}

//静态的内容总是优先于非静态
class Demo4{
    public static void main(String[] args) {
        Demo4_Static demo0 = new Demo4_Static();
        Demo4_Static demo1 = new Demo4_Static();
        Demo4_Static demo2 = new Demo4_Static();
    }

}