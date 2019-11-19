package com.cqupt.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo2 {

    /*
    * 可以改变输出语句的目的地
    *
    * 使用：
    *   System.setOut（PrintStream out）
    * 可以改变语句的目的地改为参数传递的打印流目的地
    *
    * */

    public static void main(String[] args) {
        System.out.println("我是在控制台输出的！");
        PrintStream printStream = null;
        try {
            printStream = new PrintStream("src\\com\\cqupt\\printStream\\print.txt");
            System.setOut(printStream);
            System.out.println("我在打印流中的输出！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            printStream.close();
        }
    }
}
