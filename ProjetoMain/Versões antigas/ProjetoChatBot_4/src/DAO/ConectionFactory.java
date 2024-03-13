package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectionFactory {
    
    public Connection connection(){
        
       Connection con = null;
       
        try {
            String url = "jdbc:mysql://localhost:3306/CHATBOT?user=root&password=1234";
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return con;
    }
    
}
