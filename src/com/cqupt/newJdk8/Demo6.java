package com.cqupt.newJdk8;

public class Demo6 {

    /*
    * 例如：java.lang.Runable 接口就是一个函数式接口，假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参
    * 这种情况其实和Thread类的构造方法参数为Runable没有本质的区别
    *
    * 实现多线程的方法：
    * 1.继承Thread类，然后覆盖重写run方法，
    * 2.实现Runable接口，实现其中的run方法.用Thread对象来调用这个方法的实现类
    *
    *
    * */


    public static void main(String[] args) {
        // 创建一个Thread对象，将一个实现了Runable接口的实现类对象作为Thread构造方法的参数传入，可以直接使用函数式编程
        Thread thread = new Thread(()->{
            System.out.println("这是使用lambda方法实现的多线程");
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();

        Thread thread2 = new Thread(()->{
            System.out.println("这是使用lambda方法实现的多线程");
            System.out.println(Thread.currentThread().getName());
        });
        thread2.start();

    }

}
