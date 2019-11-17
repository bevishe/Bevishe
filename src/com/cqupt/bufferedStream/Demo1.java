package com.cqupt.bufferedStream;

import java.io.*;

public class Demo1 {

    /*
    * 缓冲流：
    * 用来增强四种基本的流
    * 字节缓冲输入流：
    * 给基本的字节输入流增加一个缓冲区（数组）提高基本的字节输入流的效率
    *
    * */
    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("src\\com\\cqupt\\bufferedStream\\io.txt")));
            bufferedOutputStream.write("hello,world".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
