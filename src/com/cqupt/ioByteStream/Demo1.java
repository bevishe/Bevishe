package com.cqupt.ioByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {


    /*
    *
    * */
    public static void main(String[] args) throws IOException {
        // 写入数据到文件
        File file = new File("src\\com\\cqupt\\ioByteStream\\io.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(97);
        /*
        *  写数据的时候，会把10进制的整数转换成二进制的整数
        *
        * fileOutputStream.write(97);  ‭01100001‬
        * 硬盘中存储的所有数据都是字节，1个字节=8个比特位（‭01100001‬）
        * 任意的文本编辑器，（记事本）在打开文件的时候，都会查询编码表，把字节转换成字符表示：
        * 0-127：查询ASCII表
        * 其他的值：会查询系统默认编码表（中文：GBK，）
        * */
        fileOutputStream.close();

    }
}
