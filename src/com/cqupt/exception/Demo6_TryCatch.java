package com.cqupt.exception;

import java.io.IOException;

public class Demo6_TryCatch {
    /*
    * throw 方法的缺点：异常后面的代码不会被执行
    * 改进：try catch
    *
    * 异常处理的第二种方式：
    * 自己处理异常：
    * 格式：
    *   try{
    *       可能产生异常的代码
    *   }catch（定义一个异常的变量，用来接收try中抛出的对象）{
    *       异常的处理逻辑，异常对象产生之后，怎么处理异常对象
    *       一般在工作中，会把移仓的信息记录到一个日志中
    *   }。。。
    * catch（异常类名 变量名）{
    *
    * }
    *
    * 注意：
    *   1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    *   2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的执行逻辑，继续执行try catch之后的代码
    *     如果try中没有产生异常，那么就不会执行catch中的异常的处理逻辑代码
    * */
    public static void main(String[] args) {
        try{
            readFile("hello.tx");
        }catch(IOException ioe){//try抛出什么异常对象，那么catch就定义什么异常对象，用来接收这个对象
            System.out.println("后缀不是txt");
        }
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException{
        if(!fileName.endsWith(".txt")){
            throw new IOException("后缀不对");
        }
        System.out.println("路径没有问题");
    }

}
