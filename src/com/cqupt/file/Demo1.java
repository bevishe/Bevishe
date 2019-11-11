package com.cqupt.file;

import java.io.File;

public class Demo1 {

    /*
    * java.io.File类
    * 文件和目录路径名的抽象表示形式
    * java把电脑中的文件和文件夹目录封装为了一个File类，
    * 我们可以使用File类的方法创建，删除，获取，判断，遍历，获取大小 文件/文件夹
    *
    * File类是个与系统无关的类
    * file,directory,path
    *
    *
    * */
    public static void main(String[] args) {
        System.out.println(File.pathSeparator); // 路径分割符 win ； linux：
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator); //文件分割符 win 反斜杠\ linux 正斜杠 /
        System.out.println(File.separatorChar);
    }
}
