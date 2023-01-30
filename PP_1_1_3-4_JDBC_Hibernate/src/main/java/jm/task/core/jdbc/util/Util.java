package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String userName = "root";
    private static final String password = "root";
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connectionMySql() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not founded!!!",e);
        }
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Connection failed!!!", e);
        }
    }


}
