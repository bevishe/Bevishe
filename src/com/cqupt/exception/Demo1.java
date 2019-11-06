package com.cqupt.exception;

import jdk.nashorn.internal.runtime.ECMAException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    /*
    * 异常：指的是程序在执行过程中，出现的非正常情况，最终导致jvm的非正常停止
    * 在java等面向队形的编程语言中，异常本身就是一个类，产生异常就是创建异常对象并抛出一个异常，java处理异常的方法是中断异常
    * 异常指的并不是语法错误，语法错误了，编译不通过，不会产生字节码文件，根本不能运行
    *
    * 异常体系:
    *                                   Throwable
    *       Error                                                           Exception
    * 错误和异常的区别：
    * java.lang.Throwable：是java语言中所有错误和异常的超类
    *   Exception：编译期异常，进行编译java程序出现的问题
    *           RunTimeException：运行期异常，java程序运行过程中出现的问题
    *           异常就相当于层序得了一个小毛病，把异常处理掉，异常可以继续执行
    *   Error：错误，相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
    * */
    public static void main(String[] args) /*throws ParseException*/ {
        // 编译期异常
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); // 用来格式化日期
//        Date date = null;
//        try {
//            date = sdf.parse("19991-0909");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);
//        System.out.println("后续代码");

        // 运行期异常
//        int[] arr = {1,2,3};
//        try{
//            // 可能会出现异常的代码
//            System.out.println(arr[3]);
//        }catch (Exception e){
//            // 异常处理的逻辑
//            System.out.println(e);
//        }
//        System.out.println("后续代码");

        //error错误
        /*
        * OutOfMemoryError: Java heap space
        * 内存溢出的错误，创建的数组太大了，超出了个jvm分配的内存
        * */
        int[] arr = new int[1024*1024*1024];
        System.out.println("后续代码");
    }
}
