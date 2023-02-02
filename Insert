package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

  public static void main(String[] args) {    
    String jdbcURL = "jdbc:Mysql://127.0.0.1:3306/db";  
    String username = "root";
    String password = "Root@123";
    
    String uname = "test";
    String pass = "root";
    String email = "test@123";

    try {
      Connection conn = DriverManager.getConnection(jdbcURL, username, password);

      String sql = "INSERT INTO user (uname, email, pass) VALUES (?, ?, ?)";
      PreparedStatement statement = conn.prepareStatement(sql);
      statement.setString(1, uname);
      statement.setString(2, email);
      statement.setString(3, pass);

      int rows = statement.executeUpdate();
      
      if (rows > 0) {
        System.out.println("New user has been inserted");
      }

      conn.close();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    }
    }
