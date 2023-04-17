package com.almamedia.jobly.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {




    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:localdb");

    }
}
