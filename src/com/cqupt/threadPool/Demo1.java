package com.cqupt.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    /*线程池：
    *jdk1.5之后提供的
    * java.util.concurrent.Executors ：线程池的工厂类方法，用来生产线程池
    * Executors类中的静态方法：
    *   static ExecutorService newFixedThreadPool（int nThreads）创建一个可重用固定数量的线程池
    * */
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
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
    }

}
