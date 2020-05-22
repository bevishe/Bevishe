package com.question;

/*
* ArrayList的线程不安全演示
* */

import java.util.ArrayList;
import java.util.List;

class UnsafeArrayListThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UnsafeArrayList.arrayList.add(Thread.currentThread().getName()+""+System.currentTimeMillis());
    }
}

public class UnsafeArrayList {

    public static List arrayList = new ArrayList();


    public static  void main(String[] args){
        Thread[] threadsArray = new Thread[1000];
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new UnsafeArrayListThread();
            threadsArray[i].start();
        }

        for (int i = 0; i < threadsArray.length; i++) {
            try {
                threadsArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
