package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	
	public static void main(String[] args){
		
		String databaseURL = "jdbc:mysql://localhost:3308/cmpt370";
		String user = "root";
		String password = "pass370";
		
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		Connection conn = null;

		try {
			Class.forName(JDBC_DRIVER); // register the driver
			// establish the connection
			conn = DriverManager.getConnection(databaseURL, user, password);
			if (conn != null) {
				// adding the items
				String updateQuery = "update staff set salary=salary*1.05 where position=?";
				PreparedStatement ppStmt = conn.prepareStatement(updateQuery);
				ppStmt.setString(1, "Employee");
				int affected = ppStmt.executeUpdate();
				if (affected > 0) {
					System.out.println("Salary updated successfully!");
					conn.close();
				}
			}
		} catch (Exception exc) {
			System.err.println("Failed to connect:" + exc.getMessage());
			// exc.printStackTrace();
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
