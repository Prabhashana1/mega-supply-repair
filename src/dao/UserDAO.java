package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;
import org.mindrot.jbcrypt.BCrypt;
import util.DatabaseUtill;

/**
 *
 * @author prabhashana
 */
public class UserDAO {
    
    
    public boolean veryfiUser(String userName, String password){
        String query = " SELECT * FROM users WHERE username = ?";
        
        try (Connection con = DatabaseUtill.getConnection();
                PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                String hashedPasswordDb = rs.getString("password");

                if (BCrypt.checkpw(password, hashedPasswordDb)) {
                    return true;
                }
                
            }
            }catch(SQLException e){
                e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean saveUser(User user){
        String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
        try (Connection con = DatabaseUtill.getConnection();
                PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, user.getUserName());
            stmt.setString(2, hashPassword(user.getPassword()));
            stmt.setString(3, user.getRole());
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
            
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean deleteUser(String username) {
        String query = "DELETE FROM users WHERE username = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateUser(User user) {
        String query = "UPDATE users SET password = ?, role = ? WHERE username = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, hashPassword(user.getPassword()));
            stmt.setString(2, user.getRole());
            stmt.setString(3, user.getUserName());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                User user = new User(Integer.parseInt(rs.getString("id")), rs.getString("username"), rs.getString("password"), rs.getString("role"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    
    
    public boolean veryfiUserRole(String userName){
        String query = " SELECT role FROM users WHERE username = ?";
        
        try (Connection con = DatabaseUtill.getConnection();
                PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                if (rs.getString("role").equals("admin")) {
                    return true;
                }
                
            }
            }catch(SQLException e){
                e.printStackTrace();
        }
        return false;
    }
    
    
    
    
    
    
    
    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
}
