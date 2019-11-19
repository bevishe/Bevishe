package com.cqupt.printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo1 {
    /*
    * 打印流：
    * java.io.PrintStream:打印流
    *
    *
    * 特点：
    * 1.只负责数据的输出，不负责数据的读取
    * 2.与其他输出流不同，PrintStream永远不会抛出IOException
    * 3.有特有的方法print，println
    *
    * PrintStream extends OutputStream
    *
    * 注意：
    * 1.出如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
     * 如果使用自己特有的方法，print，println写数据，写的数据原样输
    * */

    public static void main(String[] args) {
        System.out.println("hello world!");

        // 创建一个打印流对象
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new File("src\\com\\cqupt\\printStream\\a.txt"));
            printStream.println(97);
            printStream.write(97);
            printStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            printStream.close();
        }
    }
}
