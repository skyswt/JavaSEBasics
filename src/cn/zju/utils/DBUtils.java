package cn.zju.utils;

import javax.xml.transform.Result;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtils {
    private static  final Properties PROPERTIES = new Properties();// 存储配置文件的map
    static {
        InputStream is = DBUtils.class.getResourceAsStream("/db.properties");
        try {
            PROPERTIES.load(is);
            Class.forName(PROPERTIES.getProperty("driver"));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /*static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }*/

    // 获取连接
    public static Connection getConnection() throws SQLException {
      /*  String url = "jdbc:mysql://localhost:3306/database?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String user = "root";
        String password = "123456";*/
        String url = PROPERTIES.getProperty("url");
        String user = PROPERTIES.getProperty("user");
        String password = PROPERTIES.getProperty("password");

        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
