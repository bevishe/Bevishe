package com.cqupt.file;

import java.io.File;

public class Demo3_Is {


    public static void main(String[] args) {
        File file1 = new File("src/com/cqupt/file");
        System.out.println(file1.isDirectory());
        File file2 = new File("src/com/cqupt/file/Demo1.java");
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(file2.exists());
    }
}
