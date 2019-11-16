package com.cqupt.ioCharStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    /*
    * 在jdk1.7之前使用try catch finally处理流中的异常
    *
    *
    * */

    public static void main(String[] args) {


        // 提高变量fileWriter的作用域
        try(FileWriter fileWriter = new FileWriter("W:src\\com\\cqupt\\ioCharStream\\io.txt");
                ) {
            fileWriter.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
