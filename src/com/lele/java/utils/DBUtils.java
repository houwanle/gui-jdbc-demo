package com.lele.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: lele
 * @date: 2024/10/29 08:49
 * @description:
 */

public class DBUtils {
    // 数据库连接
    public static Connection conn;

    /**
     * 获取数据库连接
     */
    public static Connection getConn() {
        try {
            // 加载数据库驱动，注册到驱动管理器
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
//            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=zhou";
            String url = "jdbc:mysql://127.0.0.1:3306/hou?useUnicode=true&characterEncoding=utf8";
            // 数据库用户名
            String username = "hou";
            // 数据库用密码
            String password = "hou";
            // 创建Connection连接
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//            throw new RuntimeException("com.microsoft.sqlserver.jdbc.SQLServerDriver类未找到！");
            throw new RuntimeException("com.mysql.jdbc.Driver类未找到！");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("数据库链接失败！");
        }
        // 返回数据库连接
        return conn;
    }
}
