package com.cqupt.transformStream;

import java.io.*;

public class Demo3 {

    /*
    * InputStreamReader:转换流
    * 字节流向字符的桥梁
    *
    * 码表：
    * GBK中文码表，使用两个字节存储一个中文
    * utf-8：国际标准码表，使用三个字节存储一个中文
    *
    * */

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(new File("src\\com\\cqupt\\transformStream\\系统.txt")),"gbk");
            int len;
            char[] a = new char[1024];
            while((len=inputStreamReader.read(a))!=-1){
                System.out.println(new String(a,0,len));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(inputStreamReader != null) inputStreamReader.close();
        }

    }
}
