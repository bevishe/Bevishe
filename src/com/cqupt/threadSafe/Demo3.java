package com.cqupt.threadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3 {

    /*
    * 4.lock
    * 使用步骤：
    *       1.在成员位置创建一个ReentrantLock对象
    *       2.在可能会出现安全问题的代码前调用Lock接口中的方法lock方法获取锁
    *       3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock方法释放锁
    * */

    public static void main(String[] args) {
        RunableImpl3 runableImpl3 = new RunableImpl3();
        Thread thread0 = new Thread(runableImpl3);
        Thread thread1 = new Thread(runableImpl3);
        Thread thread2 = new Thread(runableImpl3);
        Thread thread3 = new Thread(runableImpl3);
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class RunableImpl3 implements Runnable{
    private int stick = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                Thread.sleep(1000);
                if(stick>0){
                    System.out.println(stick);
                    stick --;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {// 无论程序是否异常都会把锁释放掉
                lock.unlock();
            }
        }
    }
}