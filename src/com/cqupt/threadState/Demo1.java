package com.cqupt.threadState;

import java.util.TreeMap;

public class Demo1 {
    /*
    *
    * TimedWaiting
    *
    * 等待唤醒案例：（线程之间的通信）
    * 顾客要买包子，和老板说明买包子的数量和种类
    * 顾客就等着老板做包子（调用wait方法）waiting状态，无线等待
    *
    * 老板开始做包子，做好包子，高速顾客做好了，可以开始吃了
    *
    * 消费者，生产者问题
    * 注意事项：
    *       1.顾客和老板线程必须得使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
    *       2.同步使用的锁对象必须要保证是唯一的，只有锁对象才能调用wait和notify方法
    *
    * Object类中的方法：
    * wait（）
    * notify（），唤醒在此对象监视器上等待的单个线程，会继续执行wait方法之后的代码
    * */

    public static void main(String[] args) {
        //创建锁对象
        Object object = new Object();
        //创建消费者线程
        new Thread(){
            @Override
            public void run() {
                while (true){

                    //保证等待和唤醒的线程只有一个在执行，需要使用同步技术
                    synchronized (object){
                        System.out.println("告知老板需要的包子种类");
                        try{
                            object.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃！");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                //
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object){
                        System.out.println("老板做好了包子");
                        object.notify();
                    }
                }


            }
        }.start();
    }
}


