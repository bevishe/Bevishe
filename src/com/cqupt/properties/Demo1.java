package com.cqupt.properties;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo1 {

    /*
    * java.util.Properties集合extends HashTable<k,v> implements Map
    *
    * Properties结合是唯一一个和IO流结合的集合
    * 可以使用Properties集合中的方法store，把集合中的零时数据持久化写入到硬盘中存储
    * 可以使用Properties集合中的方法load，把硬盘中的保存的数据，读取到集合中使用
    *
    * 属性列表中的每个键和值都是一个字符串
    * */
    public static void main(String[] args) throws IOException {
        method1();
        method2();
    }

    /*使用properties集合存储数据，遍历取出properties集合中的数据*/
    private static void method1() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(new File("src\\com\\cqupt\\properties\\properties"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> set = properties.stringPropertyNames();
        // 遍历
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s+"----"+properties.getProperty(s));
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /*
    *
    * 使用properties属性集中的store方法，向文件中存储数据
    * */
    private static void method2(){
        FileWriter fileWriter = null;
        Properties properties = new Properties();
        try {
            fileWriter = new FileWriter(new File("src\\com\\cqupt\\properties\\properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.setProperty("name","贺鹏");
        properties.setProperty("age","23");
        if(fileWriter!=null) {
            try {
                properties.store(fileWriter,"save data");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
