package com.cqupt.threadPool;

public class Demo2_RunabelImpl implements Runnable {
    private String name;

    public Demo2_RunabelImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"----"+Thread.currentThread().getName());
    }
}
