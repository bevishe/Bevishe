package com.cqupt.ioByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4_InputStream {
    /*字节输入流：
    * java.io.InputsStream
    * 所有字节输入流的超类
    *
    * 定义了所有子类共性的方法：
    *   read
    *   close
    * FileInputStream: 文件字节输入流
    * 构造方法：
    *   FileInputStream(String name)
    *   FileInputStream(File file)
    *       参数：读取文件的数据源
    * 构造方法的作用：
    *       1.会创建一个FileInputStream对象
    *       2.会把FileInputStream对象指定构造方法中的要读取的文件
    *
    *
    * 读取数据的原理：
    * （硬盘到内存）
    *   java程序--jvm--os--调用os读取文件的函数--读取文件
    *
    * 字节输入流的步骤：
    *       1.创建FileInputStream对象，构造方法中绑定读取的数据源
    *       2.使用FileInputStream对象中的read方法
    *       3.close FileInputStream对象
    *
    * */

    public static void main(String[] args) throws IOException {
        FileInputStream  fileInputStream = new FileInputStream(new File("src\\com\\cqupt\\ioByteStream\\io.txt"));
        int a;
        while((a = fileInputStream.read())!= -1){
            System.out.println((char)a);
        }
        fileInputStream.close();
    }
}
