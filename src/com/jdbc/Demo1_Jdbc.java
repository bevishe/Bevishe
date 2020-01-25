package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1_Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.导入jar包
        //2.注册驱动,在mysql5之后可以不注册，省略下面的一行代码
        Class.forName("com.mysql.jdbc.Driver");
//        3.获取数据库的连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bevishe", "root", "123456");
        //4.定义sql语句
        String sql = "update users set age = 24 where id =1";
        //5.获取执行sql的对象statement
        Statement statement = connection.createStatement();
        //6.执行sql
        int count = statement.executeUpdate(sql);
        // 处理结果
        System.out.println(count);
        // 8.释放资源
        statement.close();
        connection.close();

    }

}
