package com.cqupt.thread;

/*
* 获取线程的名称：
* 1.使用Thread类中的方法getName（）
* 2.可以先获取当前正在执行的线程，使用线程中的方法getName()获取线程名称
*
* 主线程：main
* 新线程：Thread-0 Thread-1
* */

public class Demo5_Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // 开启新线程，执行run方法
        mt.start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
