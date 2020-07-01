package com.designPatterns.createType;


// 设计模式中的创造型 单例模式
public class SingleObject {

    // 创造一个SingleObject的对象
    private static SingleObject instance = new SingleObject();

    // 设计私有的构造方法
    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("这是一个单例设计模式");
    }

}

// 单例模式的设计可以有多种方法
// 1.懒汉式，线程不安全,该方法最大的问题就是线程不安全，没有加锁，synchronized
class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){
    }

    public static Singleton1 getInstance(){
        if(instance == null)
            instance = new Singleton1();
        return instance;
    }

}

// 2.懒汉模式，线程安全
class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(instance == null)
            instance = new Singleton2();
        return instance;
    }
}

// 3.饿汉式，这种方法比价常用，但是容易产生垃圾对象，优点是没有加锁，执行效率会高，缺点是类加载的时候就会初始化，浪费内存
// 它基于classloader机制避免了多线程的同步问题
class Singleton3{
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }
}


class SingleDemoTest{

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}