package com.cqupt.thread;

/*
* 创建多线程程序的第一种方法，创建Thread类的子类
* java.lang.Thread ：描述线程的类，我们要想是想多线程程序，就必须继承Thread类
*
* 实现步骤：
* 1.创建一个Thread类的子类
* 2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（）
* 3.创建Thread子类对象
* 4.调用Thread子类中start方法，开启新的线程，run方法
*
* 多线程原理：
* main线程中的语句会优先多线程类的执行,cpu会先执行main栈空间中的方法，然后执行其他栈空间的代码
* 多线程的好处：多个线程在不同的栈空间
* */
public class Demo4_Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
        mt.run();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main--"+i);
        }
        System.out.println("hello");
    }
}