package com.cqupt.ioCharStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo3_FlushClose {


    /*
    * flush 和close方法的区别：
    *       flush：刷新缓冲区，流对象可以继续使用
    *       close：先刷新缓冲区，然后通知系统释放资源，流对象不可以继续使用
    *
    * 字符输出流写数据的其他方法：
    *   1.
    *
    *
    * */
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src\\com\\cqupt\\ioCharStream\\io.txt",true);
        char[] a = {'a','a','\r','\n','b'};
        fileWriter.write(a);
        fileWriter.flush();
        fileWriter.close();
    }
}
