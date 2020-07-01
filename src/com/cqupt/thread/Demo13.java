package com.cqupt.thread;


// 使用Thread中的join可以让进程按照你想要的顺序来执行
class FatherThread extends Thread{

    @Override
    public void run() {
        System.out.println("这是父进城在打印");
    }
}

class SonThread extends Thread{

    private FatherThread fatherThread;

    public SonThread(FatherThread fatherThread) {
        this.fatherThread = fatherThread;
    }

    @Override
    public void run() {
        this.fatherThread.start();
        try {
            this.fatherThread.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是子进城在打印");
    }
}

public class Demo13 {

    public static void main(String[] args) {
        Demo13 demo13 = new Demo13();
        SonThread sonThread = new SonThread(new FatherThread());
        sonThread.start();
    }
}
