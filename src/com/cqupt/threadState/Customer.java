package com.cqupt.threadState;

public class Customer extends Thread{
    private BaoZi baoZi;

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baoZi){
                if(baoZi.isState()){
                    System.out.println("我吃到了包子");
                    baoZi.setState(false);
                    baoZi.notify();
                }else{
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
