package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static Connection connection;

    public static Connection getConnection() throws SQLException, IOException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("lesson-10/src/main/resources/database.properties")) {
            properties.load(fis);
            String url = properties.getProperty("url");

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url);
            }
            return connection;
        }
    }
    public static void closed() throws SQLException {
        if(connection != null){
            connection.close();
        }
    }
    public static void checkConnection() throws IOException {

        try (FileInputStream fis = new FileInputStream("lesson-10/src/main/resources/database.properties")) {
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            // Chủ động đóng phương thức bằng cách close
            // Hoặc là như bên dưới
            try (Connection connection = DriverManager.getConnection(url)) {
                System.out.println("Kết nối thành công");
            } catch (SQLException e) {
                System.out.println("Kết nối thất bại");
            }
        }
    }
}
