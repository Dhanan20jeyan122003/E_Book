package com.dao;

import com.DB.DBConnect;
import com.entity.User;
import java.sql.*;

public class UserDAO {
    private Connection conn;

    public UserDAO() {
        conn = DBConnect.getConn();
    }

    public boolean saveUser(User u) {
        try (PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO users(name,email,password) VALUES(?,?,?)")) {
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public User getUserByEmail(String email) {
        User u = null;
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE email=?")) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
