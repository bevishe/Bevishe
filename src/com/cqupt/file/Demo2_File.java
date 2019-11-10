package com.cqupt.file;

import java.io.File;

public class Demo2_File {

    /*
    * 路径：
    *       绝对路径：以盘符开始的路径
    *       相对路径：一个简化的路径
    * */




    public static void main(String[] args) {
        show1();
    }
    private static void show1(){
        File file1 = new File("txt");
        System.out.println(file1);

        File file2 = new File("Demo1.java");
        System.out.println(file2);
    }

}
