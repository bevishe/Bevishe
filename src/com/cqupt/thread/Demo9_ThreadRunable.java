package com.cqupt.thread;

public class Demo9_ThreadRunable {
    /*
    * 实现Runable接口创建多线程程序的好处：
    *   1.避免了单继承的局限性
    *       一个类这可以继承一个类，类继承了Thread类就不能继承其他的类
    *       实现了Runable接口还可以继承其他的类，实现了其他的接口
    *   2.增强了程序的扩展性，降低了程序的耦合性（解耦）
    *       实现了Runable接口的方式，把设置线程任务和开启新线程进行了分离
    *       实现类中，重写了run方法：用来设置线程任务，创建Thread类对象，调用start方法（），用来开启新线程
    *
    * 匿名内部类实现多线程：
    * 匿名：没有名字
    * 内部类：写在其他类内部的类
    *
    * 匿名内部类：简化代码，把子类继承父类，重写父类的方法，穿件子类对象合一步完成
    *                   把实现类实现类接口，重写接口中的方法，创建实现类对象和成一步实现
    * 匿名内部类的最终产物：
    * 子类、实现类对象，而这个类它没有名字
    *
    * 格式：
    *   new 父类/接口（）{重写父类或者接口的方法}；
    * */

    public static void main(String[] args) {
        // 线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"bevis");
                }
            }
        }.start();

        // 线程的接口Runable
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"hepeng");
                }
            }
        }).start();
    }
}
