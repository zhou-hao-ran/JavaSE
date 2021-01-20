package org.neuedu.sjkff.Demo2;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtils {
    private static DBUtils dbUtils;
    private String driverClassNmae;
    private String url;
    private String username;
    private String password;

    private DBUtils() {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            driverClassNmae = properties.getProperty("mysql.driverClassName");
            url = properties.getProperty("mysql.url");
            username = properties.getProperty("mysql.username");
            password = properties.getProperty("mysql.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DBUtils getInstance() {
        if (dbUtils == null) {
            dbUtils = new DBUtils();
        }
        return dbUtils;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driverClassNmae);
        return DriverManager.getConnection(url, username, password);
    }

    public void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
