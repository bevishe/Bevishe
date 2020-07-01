package com.cqupt.thread;

public class Demo14_DeadLock {

    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    // 模拟两个进程
    public static void main(String[] args) {
        new Thread(()->{
            synchronized(resource1){
                System.out.println(Thread.currentThread() + "获得了resource1");
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread()+"正在等待获取resource2");

                    synchronized (resource2){
                        System.out.println(Thread.currentThread() + "获取到了resource2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            synchronized(resource2){
                System.out.println(Thread.currentThread() + "获取到了resource2");
                System.out.println(Thread.currentThread()+ "正在等待获取resource1");
                try {
                    Thread.sleep(1000);
                    synchronized(resource1){
                        System.out.println(Thread.currentThread() + "获取到了resource1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
