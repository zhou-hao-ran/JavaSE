package org.neuedu.jdbc;

import java.sql.*;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_java20?useSSL=true&characterEncoding=utf-8&useUnicode=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "select * from user where age>? and gender = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1,25);
        statement.setInt(2,1);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            boolean gender = rs.getBoolean("gender");
            Date birthday = rs.getDate("birthday");
            int age = rs.getInt("age");
            System.out.println(id+","+name+","+gender+","+birthday+","+age);
        }
    }
}
