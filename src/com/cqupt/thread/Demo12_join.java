package com.cqupt.thread;

import com.leetcode.tree.TreeNode;

public class Demo12_join extends Thread{

    // 测试Thread.join()放的


    private Thread previousThread;
    private int id;

    public Demo12_join(Thread previousThread, int id) {
        this.previousThread = previousThread;
        this.id = id;
    }


    // 使用join可以让进城按照自己的意思顺序执行
    @Override
    public void run() {
        try {
            previousThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.valueOf(this.id) + "开始打印");
    }

    public static void main(String[] args) {
        Thread privious = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Demo12_join demo12_join = new Demo12_join(privious,i);
            demo12_join.start();
            privious = demo12_join;
        }

    }
}
