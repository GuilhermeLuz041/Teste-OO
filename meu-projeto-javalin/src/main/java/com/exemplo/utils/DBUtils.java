package br.edu.ifpr.pgua.eic.tads.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class DBUtils {
    
    private static final Dotenv dotenv = Dotenv.load();
    private static final String url = dotenv.get("DB_URL");
    private static final String username = dotenv.get("DB_USERNAME");
    private static final String password = dotenv.get("DB_PASSWORD");
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}