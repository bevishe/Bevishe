package com.cqupt.threadSafe;

public class RunableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"张票");
                ticket--;
            }
        }
    }
}
