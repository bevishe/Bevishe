package com.cqupt.ioCharStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWrite {
    /*
    *
    * 字符输出流：
    *  java.io.Writer,是所有字符流的最顶层的父类，是一个抽象类
    *
    * FileWriter
    *   1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
    *   2.使用FileWriter对象中的Write方法，把数据写入到内存缓冲区中（字符转换成字节）
    *   3.使用FileWriter对象中的方法flush方法，把内存缓冲区中的数据刷新到文件中
    *   4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
    *
    * */


    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(new File("src\\com\\cqupt\\ioCharStream\\io.txt"));
            String s = "我的名字叫BevisHe！";
            fileWriter.write(s);
            fileWriter.write(s);
            fileWriter.flush();//
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
