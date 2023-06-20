package backend.repository;

import entity.Admin;
import entity.Employee;
import entity.User;
import utils.JDBCUtils;

import javax.management.relation.Role;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM `user`";
        try (
                Connection connection = JDBCUtils.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("full_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                User.Role roles = User.Role.valueOf(rs.getString("role"));
                if (roles == User.Role.ADMIN) {
                    int expInYear = rs.getInt("exp_in_year");
                    User user = new Admin(id, fullName, email, password, roles, expInYear);
                    users.add(user);
                } else {
                    String proSkill = rs.getString("pro_skill");
                    User user = new Employee(id, fullName, email, password, roles, proSkill);
                    users.add(user);
                }
            }
            return users;
        }
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM `user` WHERE id = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                if (rs.next()) {
                    String fullName = rs.getString("full_name");
                    String email = rs.getString("email");
                    String password = rs.getString("password");
                    User.Role roles = User.Role.valueOf(rs.getString("role"));
                    if (roles == User.Role.ADMIN) {
                        int expInYear = rs.getInt("exp_in_year");
                        return new Admin(id, fullName, email, password, roles, expInYear);
                    } else {
                        String proSkill = rs.getString("pro_skill");
                        return new Employee(id, fullName, email, password, roles, proSkill);
                    }
                }
                return null;
            }
        }
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM `user` WHERE id = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setInt(1,id);
            return pStmt.executeUpdate();
        }
    }

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        String sql = "SELECT * FROM `user` WHERE email = ? AND `password` = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setString(1,email);
            pStmt.setString(2,password);
            try (ResultSet rs = pStmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String fullName = rs.getString("full_name");
                    User.Role roles = User.Role.valueOf(rs.getString("role"));
                    if (roles == User.Role.ADMIN) {
                        int expInYear = rs.getInt("exp_in_year");
                        return new Admin(id, fullName, email, password, roles, expInYear);
                    } else {
                        String proSkill = rs.getString("pro_skill");
                        return new Employee(id, fullName, email, password, roles, proSkill);
                    }
                }
                return null;
            }
        }

    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO `user` (full_name,email) VALUES (?,?)";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);
            return pStmt.executeUpdate();
        }
    }
}
