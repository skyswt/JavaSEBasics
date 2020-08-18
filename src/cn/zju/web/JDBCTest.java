package cn.zju.web;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/database?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        /*Statement stmt = conn.createStatement();
        String sql = "select * from user";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            System.out.println(result.getString("name") + " " +
                    result.getInt("age"));
        }*/

        PreparedStatement pstmt = conn.prepareStatement("select * from user where name = ?");
        pstmt.setString(1, "wen");
        ResultSet result = pstmt.executeQuery();
        while (result.next()) {
            System.out.println(result.getString("name"));
        }
        result.close();
        pstmt.close();
        conn.close();
    }

}
