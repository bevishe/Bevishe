package com.cqupt.thread;

public class Demo7_Sleep {
    /*
    *
    * public static void sleep(long millis):是当前正在执行的线程以指定的毫秒数暂定
    * */

    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
