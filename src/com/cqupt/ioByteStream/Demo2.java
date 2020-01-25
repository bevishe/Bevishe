package com.cqupt.ioByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    /*
    *
    * 一次写多个字节的方法：
    *
    * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("src\\com\\cqupt\\ioByteStream\\io.txt"));
        // 调用fileOutputStream对象的方法write方法
        // 文件中显示100，需要写3个字节
        fileOutputStream.write(49);
        fileOutputStream.write(48);
        fileOutputStream.write(48);

        /*
        * write(byte[] b):将b.length字节从指定的字节数组写入到输出流
        * 一次写多个字节：
        *       1.如果写的第一个字节是正数（0-127）那么显示的时候会查询ASCII表
        *       2.如果写的第一个字节是负数，那么第一字节会和第二个字节，两个字节来显示一个中文字符
        * */
        byte[] b = {21,32,-12,31,12};
        fileOutputStream.write(b,2,2);


        // 写入字符串的方法：可以使用String类中方法将String转换Byte[]
        byte[] a = "helo world".getBytes();
        byte[] c = "你好".getBytes();
        System.out.println(c);
        fileOutputStream.write(c);
        fileOutputStream.write(a);
        fileOutputStream.close();


    }
}
