package com.cqupt.threadPool;

import java.util.concurrent.*;

public class Demo1 {
    /*线程池：
    *jdk1.5之后提供的
    * java.util.concurrent.Executors ：线程池的工厂类方法，用来生产线程池
    * Executors类中的静态方法：
    *   static ExecutorService newFixedThreadPool（int nThreads）创建一个可重用固定数量的线程池
    * */
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(4,5,60L, TimeUnit.SECONDS,new ArrayBlockingQueue(10));
        executorService.submit(new Demo2_RunabelImpl("task1"));
        executorService.submit(new Demo2_RunabelImpl("task2"));
        executorService.submit(new Demo2_RunabelImpl("task3"));
        executorService.submit(new Demo2_RunabelImpl("task4"));
        executorService.submit(new Demo2_RunabelImpl("task5"));
        executorService.submit(new Demo2_RunabelImpl("task6"));
        executorService.submit(new Demo2_RunabelImpl("task7"));
        executorService.submit(new Demo2_RunabelImpl("task8"));
        executorService.submit(new Demo2_RunabelImpl("task9"));
        // 线程池会一直开启，使用完了线程，会自动把线程归还给线程池，
        executorService.shutdown();

        System.out.println("************************************************");
        new Thread(new Demo2_RunabelImpl("taks10")).start();
        new Thread(new Demo2_RunabelImpl("taks11")).start();
        new Thread(new Demo2_RunabelImpl("taks12")).start();
        new Thread(new Demo2_RunabelImpl("taks13")).start();
        new Thread(new Demo2_RunabelImpl("taks14")).start();
        new Thread(new Demo2_RunabelImpl("taks15")).start();
    }

}
