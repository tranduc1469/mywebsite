package backend.repository;

import com.mysql.cj.x.protobuf.MysqlxPrepare;
import entity.User;
import utils.JDBCUtils;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    @Override
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM `user`";
        try(Connection connection = JDBCUtils.getConnection();
            // Cần được đóng lại
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ){
            List<User> users = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                User user = new User(id,name,email,password);
                users.add(user);
            }
            return users;
        }
    }

    @Override
    public void create(User user) throws SQLException, IOException {
        String sql = "INSERT INTO `user` (`name`, email, `password`) VALUES (?,?,?)";
        try(Connection connection = JDBCUtils.getConnection();
            PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setString(1, user.getName());
            pStmt.setString(2, user.getEmail());
            pStmt.setString(3, user.getPassword());
            pStmt.executeUpdate();
        }
    }
    @Override
    public int update(User user) throws SQLException, IOException {
        String sql = "UPDATE `user` SET `name` = ?, email = ?, `password` = ? WHERE id = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, user.getName());
            pStmt.setString(2, user.getEmail());
            pStmt.setString(3, user.getPassword());
            pStmt.setInt(4, user.getId());
            return pStmt.executeUpdate();
        }
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
//        String sql = "DELETE FROM `user` WHERE id = ?";
//        try (
//                Connection connection = JDBCUtils.getConnection();
//                PreparedStatement pStmt = connection.prepareStatement(sql)
//        ) {
//            pStmt.setInt(1, id);
//            return pStmt.executeUpdate();
//        }
        String sql = "CALL sp_delete_user(?)";
        try(
                Connection connection = JDBCUtils.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql);
        ){
            cStmt.setInt(1,id);
            return cStmt.executeUpdate();
        }
    }

}
