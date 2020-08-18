package cn.zju.web;

import cn.zju.utils.DBUtils;
import cn.zju.utils.DbUtils2;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Connection conn = DBUtils.getConnection();
        Connection conn = DbUtils2.getConnection();
        /*Statement stmt = conn.createStatement();
        String sql = "select * from user";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            System.out.println(result.getString("name") + " " +
                    result.getInt("age"));
        }*/

        PreparedStatement pstmt = conn.prepareStatement("select * from user where age = ?");
        pstmt.setString(1, "21");
        ResultSet result = pstmt.executeQuery();
        while (result.next()) {
            System.out.println(result.getString("name"));
        }
//        DBUtils.closeAll(conn, pstmt, result);
    }

}
