package com.cqupt.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    /*
    * 客户端：
    * TCP通信的客户端，向服务器发送连接请求，给服务器发送数据，读服务器发回的数据
    * 套接字：
    * 包含了IP地址和端口好的网络单位
    *
    * 注意：
    * 客户端和服务器端进行交互必须使用socket中提供的网络流，不可以使用自己创建的流对象
    * 当我们创建客户对象的时候socket对象时候，就会去请求服务器和服务器进行三次握手，这是如果服务器没有启动就会抛出异常
    * 如果服务器已经启动，那么就会进行交互了
    *
    * */

    public static void main(String[] args) {
        // 创建ip对象
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        try {
            socket = new Socket("127.0.0.1",12341);
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("客户端说：");
            String s = scanner.next();
            outputStream.write(s.getBytes());
            InputStream inputStream = socket.getInputStream();
            System.out.println("服务器端说：");
            byte[] a = new byte[1024];
            int len = inputStream.read(a);
            System.out.println(new String(a,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally { // 关闭socket对象
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            scanner.close();
        }
    }
}
