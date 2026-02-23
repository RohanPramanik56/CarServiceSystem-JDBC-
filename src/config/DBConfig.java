package config;

import java.sql.DriverManager;
import java.sql.*;


public class DBConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/CAR_SERVICES";
    private static final String USER = "root";
    private static final String PASS = "561394";

    // create a static getConnection  --->  Static so no need to create object
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
