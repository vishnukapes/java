package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

  public static void main(String[] args) {
    String jdbcURL = "jdbc:Mysql://127.0.0.1:3306/db";
    String username = "root";
    String password = "Root@123";

    try {
      Connection conn = DriverManager.getConnection(jdbcURL, username, password);

      String sql = "SELECT * FROM users";
      PreparedStatement statement = conn.prepareStatement(sql);
      ResultSet result = statement.executeQuery();
      
      while (result.next()) {
        String uname = result.getString(2);
        System.out.println(uname);
      }

      conn.close();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
