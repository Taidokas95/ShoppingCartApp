package DB;

import java.sql.*;

public class DBManager {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dslab1", "java", "password");
            System.out.println("Connected to database");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

