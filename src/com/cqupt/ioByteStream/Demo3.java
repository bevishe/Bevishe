package com.cqupt.ioByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

    /*
    * 数据的追加写和换行
    * 追加写：
    *       FileOutputStream(File file,boolean append)
    *       true 会追加写
    *
    * */



    public static void main(String[] args) throws IOException {
        // 追加写
        FileOutputStream fileOutputStream = new FileOutputStream(new File("src\\com\\cqupt\\ioByteStream\\io.txt"),true);
        byte[] a = "追加写".getBytes();
        fileOutputStream.write(a);


        // 换行
        /*
        * windows :\r\n
        * linux:\n
        * mac:\r
        * */
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好\r\n".getBytes());
        }
        fileOutputStream.close();

    }

}
