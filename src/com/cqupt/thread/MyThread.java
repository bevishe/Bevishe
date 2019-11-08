package com.cqupt.thread;

public class MyThread extends Thread {


    @Override
    public void run() {
        // 获取线程名称
//        String name = getName();
//        System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
