package com.cqupt.bufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo5_FileSort {


    /*
    * 对文本进行排序：
    *
    *
    * */

    public static void main(String[] args) {
        //1. 创建map集合，字符输入流，字符输出流对象
        HashMap<Integer,String> hashMap = new HashMap<>();
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("src\\com\\cqupt\\bufferedStream\\task.txt")));
            bufferedWriter = new BufferedWriter(new FileWriter(new File("src\\com\\cqupt\\bufferedStream\\copy.txt"),true));

            // 2.使用BufferedReader读取文件的一行，并对其进行切分，将结果放到hashMap中
            String s;
            while((s=bufferedReader.readLine())!=null){
                // 3.对字符串s进行切分，并将序号和内容放到hashmap中
                String[] array = s.split("\\.");// 注意.也需要\\进行转义

                hashMap.put(Integer.valueOf(array[0]),array[1]);
            }

            Set<Integer> integers = hashMap.keySet();
            Iterator<Integer> iterator = integers.iterator();
            while(iterator.hasNext()){
                bufferedWriter.write(hashMap.get(iterator.next()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {// 4.关闭字符输入输出流
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
