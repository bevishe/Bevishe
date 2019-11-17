package com.cqupt.bufferedStream;

import java.io.*;
import java.util.Arrays;

public class Demo2_FileInputStream {

    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("src\\com\\cqupt\\bufferedStream\\io.txt")));
            int len;
            byte[] a = new byte[1024];
            while((len=bufferedInputStream.read(a))!=-1){
                System.out.println(new String(a,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}