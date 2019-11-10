package com.cqupt.threadState;

public class Demo2_WaitAndNotify {

    /*
    * 进入到TimeWaiting有两种方法
    * 1.使用sleep（long m）方法，在毫秒值结束之后，线程睡醒进入到Runnable、Blocked状态
    * 2.使用wait（long m）方法
    *
    * 唤醒的方法：
    * 1.notify（）唤醒单个线程
    * 2.notifyAll（）唤醒对象监视器上所有的线程
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
                        System.out.println("客人2告知老板需要的包子种类");
                        try{
                            object.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，客人2开吃！");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){

                    //保证等待和唤醒的线程只有一个在执行，需要使用同步技术
                    synchronized (object){
                        System.out.println("客人1告知老板需要的包子种类");
                        try{
                            object.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，客人1开吃！");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(object) {
                        System.out.println("包子做好了");
                        object.notifyAll();
                    }
                }

            }
        }.start();
    }
}
