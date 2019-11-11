package com.cqupt.thread;

public class Demo6_ThreadMethod {
    /*
    * 设置线程的名称：（了解）
    * 1.使用Thread内中的方法setName(名字)
    *       void setName（String Name）改变线程名称，使之与参数name相同
    * 2。创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参数构造方法，把线程名称传递给父亲，让父类给子类起一个名字
    * */

    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.run();
        mt.setName("小强");
        mt.run();

        MyThread2 myThread2 = new MyThread2("旺财");
        myThread2.run();

    }
}


class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
    }
}

class MyThread2 extends Thread{
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}
