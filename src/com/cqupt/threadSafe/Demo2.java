package com.cqupt.threadSafe;

public class Demo2 {
    /*
    * 解决线程安全问题：
    * 1.同步代码块
    *   格式：synchronized（锁对象）{
    *   线程安全的对象}
    *   注意：
    *       1.通过代码块中的锁对象，可以使用任意的对象
    *       2.但是必须保证多个线程使用的锁对象是同一个
    *       3.锁对象作用：
    *                   把同步代码块锁住，只让一个线程在同步代码块中执行
    *
    * 同步技术的原理：
    * 使用了一个锁对象，这个锁对象叫同步锁，也叫对象所，也叫对象监视器
    * 3个线程一起抢夺cpu的执行权，谁抢到了谁执行run方法进行卖票
    *       t0抢到了cpu的执行权，执行run方法，遇到了synchronized代码块，
    *       这是to会检查synchronized代码块是否有锁对象，发现有，就会获取锁对象，进入到同步中执行
    *
    *       t1抢到了cpu的执行权，执行run方法，遇到了synchronized代码块，
    *       这是to会检查synchronized代码块是否有锁对象，发现没有，t1进行等待状态，一直等待t0线程归还锁对象，一直到t0线程
    *       执行完同步中的代码，会把锁对象归还给同步代码块，t1才能获取到锁对象进入到同步中执行
    *
    * 总结：
    *       同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步
    * 同步保证了只能有一个线程在同步中执行能给共享数据，保证了安全，但是会降低程序的效率
    *
    * 2.使用同步方法
    * 使用步骤：
    *       1.把访问共享数据的代码抽取出来，放到一个方法中
    *       2.在方法上添加一个synchronized的修饰符
    *
    * 同步方法也会把方法内部的代码锁住，只让一个线程执行，同步方法的锁对象是谁，就是实现类对象，this
    *
    * 3.静态方法
    * 静态的同步方法，多对象是？不肯能是this
    * this是创建对象之后产生的，静态方法优先于对象
    * 静态方法的锁对象是本类的class属性-->class文件对象
    *
    *
    * 4.Lock锁
    * 见Demo3.java
    * java.util.concurrent.locks
    * */

    public static void main(String[] args) {
//        SafeThread runable = new SafeThread();
//        Thread thread0 = new Thread(runable);
//        Thread thread1 = new Thread(runable);
//        Thread thread2 = new Thread(runable);
//
//        thread0.start();
//        thread1.start();
//        thread2.start();
//
//        SafeThread2 safeThread2 = new SafeThread2();
//        safeThread2.start();
//        safeThread2.start();
//        safeThread2.start();
//
//        System.out.println("****************************");
        RunableImpl2 runableImpl2 = new RunableImpl2();
        Thread thread3 = new Thread(runableImpl2);
        Thread thread4 = new Thread(runableImpl2);
        Thread thread5 = new Thread(runableImpl2);
        thread3.start();
        thread4.start();
        thread5.start();

    }
}

class SafeThread implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    Object object = new Object();

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }
}

class SafeThread2 extends Thread{
    private int tick = 100;
    public synchronized void payTicket(){
        if(tick>0){
            System.out.println(Thread.currentThread().getName()+"正在卖票"+tick);
            tick --;
        }
    }

    @Override
    public void run() {
        while(true){
            payTicket();
        }
    }
}

class RunableImpl2 implements Runnable{
    public static int stick = 100;

    public static synchronized void payTick(){
        if(stick > 0){
            System.out.println(stick);
            stick --;
        }
    }

    @Override
    public void run() {
        while(true){
            payTick();
        }
    }
}