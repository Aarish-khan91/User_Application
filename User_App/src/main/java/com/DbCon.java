package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Modify with your database URL
    private static final String USERNAME = "system"; // Modify with your username
    private static final String PASSWORD = "manager"; // Modify with your password

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Oracle JDBC Driver not found", e);
        }
    }

    public static Connection getCon() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Failed to get database connection", e);
        }
        return con;
    }

    
}
