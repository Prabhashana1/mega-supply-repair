package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import util.DatabaseUtill;

/**
 *
 * @author prabhashana
 */
public class CustomerDAO {
    
    public boolean saveCustomer(Customer customer){
        String query = "INSERT INTO customers (name, phone_model, issue_description) VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseUtill.getConnection();
                PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getPhoneModel());
            stmt.setString(3, customer.getIssueDescription());
            stmt.setDate(4, (Date) customer.getAcceptedDate());
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
            
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean deleteCustomer(int customerId) {
        String query = "DELETE FROM customers WHERE id = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean updateCustomer(Customer customer) {
        String query = "UPDATE customers SET name = ?, phone_model = ?, issue_description = ?, accepted_date = ? WHERE id = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getPhoneModel());
            stmt.setString(3, customer.getIssueDescription());
            stmt.setDate(4, (Date) customer.getAcceptedDate());
            stmt.setInt(5, customer.getCustomerId());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM customers";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Customer customer = new Customer(Integer.parseInt(rs.getString("id")), rs.getString("name"), rs.getString("phone_model"), rs.getString("issue_description"), rs.getDate("accepted_date"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    public int getNextCustomerId() {
        String query = "SELECT MAX(id) AS maxId FROM customers";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int maxId = rs.getInt("maxId");
                return maxId + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    
}
