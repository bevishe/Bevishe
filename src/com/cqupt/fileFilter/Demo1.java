package com.cqupt.fileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo1 {

    /*
    * 文件过滤器：
    * 只要java结尾的文件
    * 1.File[] listFiles(FileFilter filter)
    * 2.File[] listFiles(FilenameFilter filter )
    *
    *java.io.Filter 用于抽象文件路径名的接口
    * 作用：用来过滤文件（File对象）
    *
    * java.io.FilenameFilter() 接口
    * 实现此接口的类可以用于过滤器文件名称
    * 抽象方法：用于过滤文件名称
    * 注意：两个过滤器都是没有实现类的，需要我们自己来定义实现类，
    * */

    public static void main(String[] args) {
        File file = new File("test.txt");
        File[] l = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });

        File[] l2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
                // 参数：
                    /*
                    * File dir:构造方法中传递的被遍历的目录
                    * String name:使用listfiles方法遍历目录，获取的每一个文件或者文件夹的名称
                    * */
            }
        });

        File fileTest = new File("src//com//cqupt//file");
        File[] f = fileTest.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java")){
                    return true;
                }else{
                    return false;
                }
            }
        });
        for (File file1 : f) {
            System.out.println(file1);
        }

        System.out.println("***************************************");
        File[] noFilter = fileTest.listFiles();
        for (File file1 : noFilter) {
            System.out.println(file1);
        }
    }

    private static File[] method(){
        File[] files = {};

        return files;
    }
}