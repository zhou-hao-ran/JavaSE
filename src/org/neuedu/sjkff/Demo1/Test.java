package org.neuedu.sjkff.Demo1;

import org.neuedu.sjkff.Demo2.DBUtils;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getInstance().getConnection();
            String sql = "select * from user where age>?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 25);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                boolean gender = rs.getBoolean("gender");
                Date birthday = rs.getDate("birthday");
                int age = rs.getInt("age");
                System.out.println(id + "," + name + "," + gender + "," + birthday + "," + age);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.getInstance().close(rs);
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }
    }
}
