package com.cqupt.ioByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo5_FileInputStream {
    /*
    *
    * 一次读取多个字节的方法
    *
    * 明确两件事情；
    * 1.方法的参数byte【】数组有什么作用？
    *       起到缓冲作用，存储每次读取到的多个字节
    *       数组的长度一般定义为1024或者是它的倍数
    * 2.方法的返回值int是什么？
    *       每次读取的数组有效长度
    * */

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("src\\com\\cqupt\\ioByteStream\\io.txt"));
        byte[] a= new byte[4];
        int len;
        while((len=fileInputStream.read(a))!=-1){
            String s = new String(a,0,len);
            System.out.println(s);
            System.out.println(new String(a));
        }
        fileInputStream.close();



    }
}
