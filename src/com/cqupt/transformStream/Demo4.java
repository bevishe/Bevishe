package com.cqupt.transformStream;

import java.io.*;

public class Demo4 {

    /*
    * OutputStreamWrite：
    *
    * 将gbk的编码转成utf-8写入文件
    *
    * */
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("src\\com\\cqupt\\transformStream\\gbk.txt")),"gbk");
        outputStreamWriter.write("你好！，这是gbk编码的。");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
