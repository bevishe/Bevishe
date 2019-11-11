package com.cqupt.thread;

public class Demo3_MainThread {
    /*
    * 主线程：执行主方法的线程
    *
    * 单线程程序：java程序中只有一个线程
    *
    *
    * Jvm执行main方法，main方法会进入到内存
    * jvm会找操作系统开辟一条main方法通向cpu的执行路径
    * cpu就可以通过这个路径来执行main方法
    * 而这个路径就叫main（主线程）线程
    * */

    public static void main(String[] args) {
        //单线程
        Person p1 = new Person("小强");
        Person p2 = new Person("小王");
        p1.run();
        p2.run();
    }
}
