package com.cqupt.file;

import java.io.File;

public class Demo5 {
    /*
    * 对目录的遍历创建：
    *
    * */
    public static void main(String[] args) {
        File file = new File("src\\com\\cqupt\\file");
        String[] fileList = file.list();
        File[] filesList = file.listFiles();
        for (String s : fileList) {
            System.out.println(s);
        }
        for (int i = 0; i < filesList.length; i++) {
            System.out.println(filesList[i].getPath());
        }
    }
}
