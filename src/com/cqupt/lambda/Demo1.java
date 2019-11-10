package com.cqupt.lambda;

public class Demo1{
    /*
    * 函数式编程：
    * 思想是尽量忽略面向对象的复杂语法，强调做什么而不是以什么形式做
    *
    * 面向对象的思想：
    * 做一件事情，找一个可以解决这个事情的对象，调用对象的方法，完成事情。
    * 函数式编程思想：
    * 只要能获取到结果就可以了，谁去做的怎么做的不重要，重视的是结果不重视过程
    * */
    public static void main(String[] args) {
        /*使用实现Runable接口的方式来实现多线程*/
        Runnable runnable = new RunableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        // 简化代码
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}

class RunableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
