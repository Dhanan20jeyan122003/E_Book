package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    private static Connection conn;

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/book_app?useSSL=false&serverTimezone=UTC",
                    "root",        // <-- your MySQL username
                    "Jeyam@2003"     // <-- your MySQL password
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
