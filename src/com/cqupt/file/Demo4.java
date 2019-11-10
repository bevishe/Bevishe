package com.cqupt.file;

import java.io.File;
import java.io.IOException;

public class Demo4 {

    /*
    * 创建删除文件：
    * createNewFile()
    * 删除文件或者文件夹
    * delet（）
    * 创建File表示的目录
    * mkdir（）
    * 创建由File表示的目录，包括任何必需但是不存在的父目录
    * */
    public static void main(String[] args) {
        File file = new File("src\\com\\cqupt\\file");
        File file1 = new File(file,"test");
        System.out.println("file1是否存在"+file1.exists());
        file1.mkdir();
        System.out.println("file1是否存在"+file1.exists());
        System.out.println("file1是否删除"+file1.delete());
        File file2 = new File(file,"test.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("test文件是否创建成功"+file2.exists());
    }
}
