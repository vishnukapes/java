package assignment2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	  public static void main(String[] args) {
	    String jdbcURL = "jdbc:Mysql://127.0.0.1:3306/db";
	    String username = "root";
	    String password = "Root@123";
	    
	    String pass = "toor@123";

	    try {
	      Connection conn = DriverManager.getConnection(jdbcURL, username, password);

	      String sql = "UPDATE user SET pass=? WHERE uname='test'"; 

	      PreparedStatement statement = conn.prepareStatement(sql);
	      statement.setString(1, pass);

	      int rows = statement.executeUpdate();

	      if (rows > 0) {
	        System.out.println("Password has been updated for the user 'test'");
	      }

	      conn.close();

	    } catch (SQLException ex) {
	      ex.printStackTrace();
	    }
	  }
	}
