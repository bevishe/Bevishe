package com.cqupt.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo8_Finally {

    /*
    * finally 代码块：
    *   格式：
    *       try{
    *
    *       }catch（）{
    *
    *       }finally{
    *
    *       }
    *   注意：
    *       1.finally不能单独使用，必须和try一起使用
    *       2.finally一般用于资源释放（回收资源），无论程序是否出现异常，最后都要释放资源
    *
    *
    *
    * 异常的注意事项：
    * 多个异常使用捕获又该如何处理？
    * 1.多个异常分别处理
    * 2.多个异常一次捕获，多次处理
    * 3.多个异常一次捕获，一次处理
    *     运行时异常被抛出可以不处理，即不捕获，也不声明抛出
    *     默认给虚拟机处理，终止程序，什么时候不抛出运行时异常了再来继续执行程序
    *
    * 一个try多个catch注意事项：
    * 1.catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写到上边，否则会报错
    * 2.
    *
    * try中可能会产生的异常对象：
    * try中如果出现异常对象，会把异常对象抛出给catch处理
    * 抛出的异常对象会从上到下依次赋值给catch中定义的异常变量
    * */

    public static void main(String[] args) {

        method();


        try {//可能会产生异常的代码
            readFile("hell.tx");
        } catch (IOException e) {
            // 异常的处理逻辑
            e.printStackTrace();
        }finally {
            // 无论是否异常，都会执行
            System.out.println("资源释放");
        }
        System.out.println("后续代码");

    }

    private static void method(){
        try {
            int[] arr = {1,32,3,3};
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.get(4);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("后续代码！");
    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("后缀不对");
        }
        System.out.println("路径没有问题");
    }
}
