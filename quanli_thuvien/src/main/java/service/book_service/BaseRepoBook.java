package service.book_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepoBook {
    public static Connection connection;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/library";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
