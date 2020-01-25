package com.jdbc;

public class Demo2_DriverManager {
    /*驱动管理对象
    * 功能：
    *   1.注册驱动
    *       static void registerDriver
    *       写代码使用 Class.forname("com.mysql.jdbc.Driver")
    *   2.获取数据库连接
    *
    *
    *
    * */



    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }
}
