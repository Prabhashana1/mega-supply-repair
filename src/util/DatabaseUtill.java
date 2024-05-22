package util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author prabhashana
 */
public class DatabaseUtill {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mega_supply";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            //throw new RuntimeException("Error connecting to database", e);
            JOptionPane.showMessageDialog(null, "Unable to connect database because : "+e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
}
