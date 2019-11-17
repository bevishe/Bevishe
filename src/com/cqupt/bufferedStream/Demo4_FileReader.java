package com.cqupt.bufferedStream;

import java.io.*;

public class Demo4_FileReader {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("src\\com\\cqupt\\bufferedStream\\io.txt")));
            int len;
            char[] a = new char[1024];
            while((len=bufferedReader.read(a))!=-1){
                System.out.println(new String(a,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
