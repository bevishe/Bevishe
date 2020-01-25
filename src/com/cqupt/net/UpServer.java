package com.cqupt.net;

/*
*
* 文件上传的服务器端
* */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UpServer {


    public static void main(String[] args) {
        // 1.从客户端接收文件，监听获得客户端的socket

        ServerSocket serverSocket = null;
        Socket socket = null;
        byte[] fileByte = new byte[1024];
        int len = 0;
        try {
            serverSocket = new ServerSocket(12345);
            socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            len = inputStream.read(fileByte);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("文件上传成功！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String fileName = "up.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("src\\com\\cqupt\\net\\net\\"+fileName));
            fileOutputStream.write(fileByte,0,len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
