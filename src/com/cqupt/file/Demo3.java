package com.cqupt.file;

import java.io.File;

public class Demo3 {

    /**
     * File类是操作系统无关的类
     * 注意java项目的当前路径是项目的根目录
     * */
    public static void main(String[] args) {

        File file = new File("D:\\JAVAHOME\\Bevishe\\src\\com\\cqupt");
        File absoluteFile = file.getAbsoluteFile();
        // 获取绝对路径
        System.out.println(absoluteFile);

        File file1 = new File("Demo1.java");
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);
        File absoluteFile1 = file1.getAbsoluteFile();
        System.out.println(absoluteFile1);

        File file2 = new File("src\\com\\cqupt\\file\\文件笔记.md");
        String ab = file2.getAbsolutePath();
        System.out.println(ab);
        System.out.println(file2.exists());
        System.out.println(file2.length());

    }
}
