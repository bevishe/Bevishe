package com.cqupt.recursive;
import java.io.File;
import java.util.ArrayList;

public class Demo4 {
    // 递归打印多级文件夹
    /*
     * 多级目录打印，就是当前目录的嵌套，遍历之前，无从知道到底有多级目录，所以要用到递归实现
     *
     * */
    public static void main(String[] args) {
        File file = new File("src\\com\\cqupt\\recursive");
        method(file);
    }

    // 定义一个方法，参数传递File类型的目录，对该目录进行遍历
    private static void method(File filedir){
        File[] fileList = filedir.listFiles();
        for (File file : fileList) {
            if(file.isDirectory()){
                method(file);
            }else
                System.out.println(file);
        }
    }
}



