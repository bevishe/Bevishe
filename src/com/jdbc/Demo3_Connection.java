package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo3_Connection {

    /*
    * 数据库连接对象
    * 获取数据库的连接
    * */
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bevishe", "root", "123456");
        connection.close();
    }
}
