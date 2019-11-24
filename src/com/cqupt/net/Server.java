package com.cqupt.net;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Server {


    /*
    * 服务器端：
    *
    * */
    public static void main(String[] args) {
        // 创建服务器套接字
        ServerSocket serverSocket = null;
        Socket socket = null;
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        try {
            serverSocket = new ServerSocket(12341);
            // 服务器端使用accept监听获得请求连接的客户端对象的socket对象
            socket = serverSocket.accept();
            // 从获得的客户端对象的socket对象获取输入流对象
            InputStream inputStream = socket.getInputStream();
            byte[] a = new byte[1024];
            int len;
            len = inputStream.read(a);
            System.out.println(new String(a,0,len));
            System.out.println("我说：");
            // 从接受的socket对象中获取输出流对象
            OutputStream outputStream = socket.getOutputStream();
            String s = scanner.next();
            outputStream.write(s.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();
        }
    }
}
