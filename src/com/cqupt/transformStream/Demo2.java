package com.cqupt.transformStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {


    /*
    * FileReader 可以读取IDE默认编码格式（utf-8）的文件
    * FileReader读取系统默认编码（GBK）会产生乱码
    *
    * */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("src\\com\\cqupt\\transformStream\\系统.txt"));
        int len;
        char[] a = new char[1024];
        len = fileReader.read(a);
        // 会产生乱码，ide使用的utf，文件是系统默认的gbk编码
        System.out.println(new String(a,0,len));
        fileReader.close();
    }
}
