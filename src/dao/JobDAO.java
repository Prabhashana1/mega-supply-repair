package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Job;
import util.DatabaseUtill;

/**
 *
 * @author prabhashana
 */
public class JobDAO {
    
    
    public boolean addJob(Job job){
        String query = "INSERT INTO jobs (customer_id, status) VALUES (?, ?)";
        try (Connection con = DatabaseUtill.getConnection();
                PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1, job.getCustomerId());
            stmt.setString(2, job.getStatus());
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
            
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteJob(int jobId) {
        String query = "DELETE FROM jobs WHERE id = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, jobId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean updateJob(Job job) {
        String query = "UPDATE jobs SET customer_id = ?, status = ? WHERE id = ?";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, job.getCustomerId());
            stmt.setString(2, job.getStatus());
            stmt.setInt(3, job.getJobId());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Job> getAllJobs() {
        List<Job> jobs = new ArrayList<>();
        String query = "SELECT * FROM jobs";
        try (Connection conn = DatabaseUtill.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Job job = new Job(Integer.parseInt(rs.getString("id")), Integer.parseInt(rs.getString("customer_id")), rs.getString("status"));
                jobs.add(job);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobs;
    }
    
    
}
