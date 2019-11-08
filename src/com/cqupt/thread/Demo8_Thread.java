package com.cqupt.thread;

public class Demo8_Thread {

    /*
    * 创建多线程类的第二种方法：
    * 1.创建一个实现Runable接口的实现类，并实现其中的run方法
    * 2.创建一个Thread类对象，并吧Runable的实现类对象放入Thread的构造方法中
    * 3.调用thread类对象的start方法，开启多线程
    * */

    public static void main(String[] args) {
        MyThreadRunable myThreadRunable = new MyThreadRunable();
        Thread thread = new Thread(myThreadRunable);
        thread.setName("小强");
        thread.start();
    }
}

class MyThreadRunable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}