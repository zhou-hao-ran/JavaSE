package org.neuedu.sjkff.Demo2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMapperImpl implements UserMapper {

    @Override
    public User userLogin(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User findUser = null;
        try {
            conn = DBUtils.getInstance().getConnection();
            String sql = "select * from user where username=? and password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                findUser = new User();
                findUser.setId(rs.getLong("id"));
                findUser.setName(rs.getString("name"));
                findUser.setUsername(rs.getString("username"));
                findUser.setPassword(rs.getString("password"));
                findUser.setGender(rs.getBoolean("gender"));
                findUser.setBirthday(rs.getDate("birthday"));
                findUser.setAge(rs.getInt("age"));
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
        return findUser;
    }

    @Override
    public int findSignInfoByIdAndDate(Long uid, String signIn) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            conn = DBUtils.getInstance().getConnection();
            String sql = "select count(*) as counts from signinfo where uid=? and date_format(signin,'%Y-%m-%d')=?";
            ps = conn.prepareStatement(sql);
            ps.setLong(1, uid);
            ps.setString(2, signIn);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("counts");
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
        return count;
    }

    @Override
    public int insertSignInfo(Long uid, Date signIn) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            conn = DBUtils.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into signinfo values(default,?,?,default)";
            ps = conn.prepareStatement(sql);
            ps.setLong(1, uid);
            ps.setTimestamp(2, new Timestamp(signIn.getTime()));
            count = ps.executeUpdate();
            conn.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }
        return count;
    }

    @Override
    public int updateSignInfo(Long uid, Date signOut) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        try {
            conn = DBUtils.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql ="update signinfo set signOut=? where uid=? and date_format(signIn,'%Y-%m-%d')=date_format(?,'%Y-%m-%d')";
            ps = conn.prepareStatement(sql);
            ps.setTimestamp(1, new Timestamp(signOut.getTime()));
            ps.setLong(2, uid);
            ps.setTimestamp(3, new Timestamp(signOut.getTime()));
            count = ps.executeUpdate();
            conn.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            DBUtils.getInstance().close(ps);
            DBUtils.getInstance().close(conn);
        }
        return count;
    }

    @Override
    public List<SignInfo> getSignInfoByUid(Long uid) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<SignInfo> list = new ArrayList<>();
        try {
            conn = DBUtils.getInstance().getConnection();
            String sql = "select * from signinfo where uid=?";
            ps = conn.prepareStatement(sql);
            ps.setLong(1,uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                SignInfo signInfo = new SignInfo();
                signInfo.setId(rs.getLong("id"));
                signInfo.setUid(rs.getLong("uid"));
                signInfo.setSignIn(rs.getTimestamp("signIn"));
                signInfo.setSignOut(rs.getTimestamp("signOut"));
                list.add(signInfo);
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
        return list;
    }
}
