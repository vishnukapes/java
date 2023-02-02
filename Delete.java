package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
  public static void main(String[] args) {
    String jdbcURL = "jdbc:Mysql://127.0.0.1:3306/db";
    String username = "root";
    String password = "Root@123";

    try {
      Connection conn = DriverManager.getConnection(jdbcURL, username, password);

      String sql = "DELETE FROM user WHERE uname = ?";

      PreparedStatement statement = conn.prepareStatement(sql);
      statement.setString(1, "test");

      int rowsDeleted = statement.executeUpdate();
      if (rowsDeleted > 0) {
        System.out.println("User has been deleted");
      }

      statement.close();
      conn.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
