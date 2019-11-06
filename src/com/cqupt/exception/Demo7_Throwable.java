package com.cqupt.exception;

import java.io.IOException;

public class Demo7_Throwable {

    /*
    * Throwable类中定义了三个处理异常的方法
    * 1.getMessage（）
    *
    * 2.toString（）
    * 3.printStackTrack（）
    * jvm打印异常对象，默认此方法，信息是最全的
    * */

    public static void main(String[] args) {
        try{
            readFile("hello.tx");
        }catch(IOException ioe){//try抛出什么异常对象，那么catch就定义什么异常对象，用来接收这个对象
            System.out.println("后缀不是txt");
            System.out.println(ioe.toString());
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }
        System.out.println("后续代码");

    }
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("后缀不对");
        }
        System.out.println("路径没有问题");
    }
}
