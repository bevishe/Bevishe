package com.cqupt.ioByteStream;

import java.io.*;

public class Demo6_FileCopy {
    /*
    * 文件复制
    * 字节流读取文件是的问题：
    *       当使用字节流读取文本文件时，可能会有一个小问题，就是遇到中文字符时，可能不会显示完整的字符，那是因为一个中文字符可能占用多个字节存储。
    *       所以java中提供了一些字符流，以字符流为单位读写数据的时候，专门用于处理文本文件。
    *
    * */

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("src\\com\\cqupt\\ioByteStream\\img\\figure1.png"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("src\\com\\cqupt\\ioByteStream\\copy.png"));
        int len;
        while((len = fileInputStream.read())!= -1){
            fileOutputStream.write(len);
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("文件复制完成！");

    }
}
