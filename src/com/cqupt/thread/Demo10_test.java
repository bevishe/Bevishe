package com.cqupt.thread;

import org.junit.Test;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;



public class Demo10_test {

    // 实现多线程的几种方法
    // 1.继承Thread类
    class Thread_1 extends Thread{
        @Override
        public void run() {
            System.out.println("执行了通过继承Thread类来实现多线程的run方法");
        }
    }

    Thread_1 newTread_1(){
        return new Thread_1();
    }

    class Thread_2 implements Runnable{

        @Override
        public void run() {
            System.out.println("执行了实现Runnable接口中的run方法");
        }
    }

    Thread_2 newTread_2(){
        return new Thread_2();
    }

    class Thread_3 implements Callable{
        @Override
        public Object call() throws Exception {
            System.out.println("执行了实现Callable接口中的call方法");
            Thread.sleep(1000);
            return "i am callable";
        }
    }

    Thread_3 newThread_3(){
        return new Thread_3();
    }

    @Test
    public void ThreadTest(){
        Thread_1 thread_1 = new Thread_1();
        Thread_2 thread_2 = new Thread_2();
        Thread_3 thread_3 = new Thread_3();
        FutureTask<String> task = new FutureTask<>(thread_3);

        thread_1.start();
        new Thread(thread_2).start();

        new Thread(task).start();;
    }

    public static void main(String[] args) {
        Demo10_test demo10_test = new Demo10_test();
        Thread_1 thread_1 = demo10_test.newTread_1();
        thread_1.start();

        Thread_2 thread_2 = demo10_test.newTread_2();
        new Thread(thread_2).start();

        Thread_3 thread_3 = demo10_test.newThread_3();
        FutureTask<String> task = new FutureTask<>(thread_3);
        new Thread(task).start();
    }
}
