package com.cqupt.ioCharStream;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

    /*
    * 使用字节流读取中文文件：
    * 1个中文：
    *       GBK：占用两个字节
    *       Utf-8：占用3个字节
    *
    * 字符流：
    * 读写的父类：
    * java.io.Reader(字符输入流的最顶层的父类)
    *   close  read ready reset skip mark
    *
    *
    *
    * java.io.Writer
    * */

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("src\\com\\cqupt\\ioCharStream\\io.txt"));
        int len;
        char[] a = new char[1024];
        while((len=fileReader.read(a))!= - 1){
            System.out.println("a的长度"+a.length);
            for (char c : a) {
                System.out.println(c);
            }
            System.out.println("_____________________");
            System.out.println(new String(a,0,len));
        }
        fileReader.close();
    }
}
