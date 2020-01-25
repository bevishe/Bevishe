package com.bevis.util;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {

    private static void getGoodClass(File file){
        // 创建存储优秀学生课程的hashmap,姓别姓名id作为key
        HashMap<String, List<String>> goodClass = new HashMap<>();

        //1 创建字符串输入流
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                //System.out.println(line);

                // 使用正则对一行数据进行切分
                Pattern pattern = Pattern.compile("^(.\"|\")(.*?)\"\t\"(.*?)\"\t\"(.*?)\"");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    String keyId = matcher.group(2)+matcher.group(3);
                    //判断学生是否在hashmap之中
                    if(goodClass.containsKey(keyId)){
                        goodClass.get(keyId).add(matcher.group(4));
                    }else{
                        // 创建value对象
                        ArrayList<String> classList = new ArrayList<>();
                        classList.add(matcher.group(4));
                        goodClass.put(keyId,classList);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 打印结果
        Set<String> set = goodClass.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.print(key+"-->");
            // 打印课程
            for (String s : goodClass.get(key)) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        getGoodClass(new File("src\\com\\bevis\\util\\无标题.txt"));

    }

}
