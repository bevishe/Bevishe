package com.cqupt.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5_Throws {

    /**
     * throws 关键字：处理异常的第一种方式，交给别人处理
     * 作用：
     *      当方法内部抛出异常的时候，那么我们就必须处理这个异常
     *      可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理，最终交给jvm-中断处理
     * 使用格式：
     *      修饰符 返回值类型 方法名（参数列表） throws AAAException{
     *          throw new AAAException("产生原因！");
     *      }
     * 注意：
     *      1.throws关键字必须写在方法声明出
     *      2.throws关键字后面声明的异常必须是Exception或者是Exception的子类
     *      3.方法内部抛出了多个异常对象，那么throws后边必须也声明多个异常
     *          如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
     *      4.调用一个声明抛出异常的方法，我们就必须的处理声明的异常
     *          要么继续使用throws声明抛出，交给方法的调用者处理，最终交给jvm
     *          要吗try catch自己处理异常
     */

    /*
    * FileNotFoundException 是IOException的子类，
    * FileNotFoundException extends IOException entends Exception
    * 直接声明父类异常就可以
    * */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        readFile("c:\\\\a.tx");

    }

    /*
    * 定义一个方法，对传递的文件路径进行合法性判断
    * 如果路径不是c：\\a.txt那么我们就抛出文件找不到异常，告知方法的调用者
    * 注意：
    *   FileNotFoundException是编译期异常，抛出了异常，就必须处理这个异常
    *   可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
    * */
    public static void readFile(String fileName) throws FileNotFoundException,IOException{
        if(!fileName.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件不存在");
        }
        /*
        * 如果传递的路径不是.txt结尾，
        * 那么我们就让抛出IO异常对象，告诉方法的调用者，文件的后缀名不对
        *
        * */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名异常");
        }
        System.out.println("文件没有问题，读取文件");
    }
}
