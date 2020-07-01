package com.cqupt.thread;

import java.util.ArrayList;
import java.util.Vector;

class ThreadPrint implements Runnable{
    private String name;

    public ThreadPrint(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("my name is "+this.name);
    }
}

// 验证ArrayList是线程不安全的
class ThreadPrintArrayList implements Runnable{

    private String name;
    private Vector<String> arrayList;

    public ThreadPrintArrayList(String name, Vector<String> arrayList) {
        this.name = name;
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        this.arrayList.add(this.name);
        System.out.println(this.name+" 向arrayList添加了自己"+this.arrayList.get(0));
        String temp = this.arrayList.remove(0);
        System.out.println(this.name+" 删除了自己"+temp);
    }
}


public class Demo11 {

    public Vector<String> testTreadSafe;

    // 可以看见java中的线程是抢占式的
    public static void main(String[] args) {
        ThreadPrint print1 = new ThreadPrint("jack");
        ThreadPrint print2 = new ThreadPrint("rose");
        ThreadPrint print3 = new ThreadPrint("mark");

        new Thread(print1).start();
        new Thread(print2).start();
        new Thread(print3).start();

        System.out.println("验证在java里面ArrayList是线程不安全的");
        System.out.println("*********************************************");
        Demo11 demo11 = new Demo11();
        demo11.testTreadSafe = new Vector<>();

        ThreadPrintArrayList threadPrintArrayList1 = new ThreadPrintArrayList("hello",demo11.testTreadSafe);
        ThreadPrintArrayList threadPrintArrayList2 = new ThreadPrintArrayList("world",demo11.testTreadSafe);
        ThreadPrintArrayList threadPrintArrayList3 = new ThreadPrintArrayList("java",demo11.testTreadSafe);

        new Thread(threadPrintArrayList1).start();
        new Thread(threadPrintArrayList2).start();
        new Thread(threadPrintArrayList3).start();

    }
}
