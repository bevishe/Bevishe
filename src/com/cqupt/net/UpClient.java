package com.cqupt.net;

/*
*
* 文件上传的客户端
*
* */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class UpClient {

    public static void main(String[] args) {
        // 1.从本地读取文件，使用FileInputStream，从文件读取到内存中
        FileInputStream fileInputStream = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要读取的文件名");
        String fileName = scanner.next();
        byte[] fileByte = null;
        int len = 0;
        try {
            fileInputStream = new FileInputStream(new File("src\\com\\cqupt\\net\\local\\"+fileName));
            fileByte = new byte[1024];
            len = fileInputStream.read(fileByte);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // 2.准备将从本地读取的问价创建socket发送到服务器端
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",12345);
            System.out.println("文件开始上传。。。。");
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(fileByte,0,len);
            // 从服务器端接收信息
            InputStream inputStream = socket.getInputStream();
            byte[] a = new byte[1024];
            int aLen = inputStream.read(a);
            System.out.println(new String(a,0,aLen));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
