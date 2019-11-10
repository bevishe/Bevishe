package com.cqupt.lambda;

public class Demo2_Lambda {
    public static void main(String[] args) {

        // 使用lambda实现多线程
        new Thread(()-> System.out.println(Thread.currentThread().getName())
        ).start();
    }
}