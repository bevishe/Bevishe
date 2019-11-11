package com.cqupt.threadSafe;

public class Demo1 {
    /*
    * 电影院卖票问题：多线程访问了共享的数据，会产生线程安全问题
    * 注意：线程安全问题是不能产生的，我们可以让一个线程在访问共享数据的是时候，无论是否失去了cpu的执行权，
    * 让其他的线程只能等待，等待当前线程卖完票，其他线程再进行卖票
    * 开启了三个线程：
    * t0，t1，t2
    * 三个线程一起抢夺cpu的执行权，谁抢到谁执行
    * */
    public static void main(String[] args) {
        RunableImpl runable = new RunableImpl();
        Thread thread0 = new Thread(runable);
        Thread thread1 = new Thread(runable);
        Thread thread2 = new Thread(runable);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}