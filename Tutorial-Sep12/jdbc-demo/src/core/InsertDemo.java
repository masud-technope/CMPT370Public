package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {

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
				String insertQuery = "insert into branch (branchNo, street,city, postalcode) value(?,?,?,?)";
				PreparedStatement ppStmt = conn.prepareStatement(insertQuery);
				ppStmt.setInt(1, 3);
				ppStmt.setString(2, "110 Science Pl");
				ppStmt.setString(3, "Saskatoon");
				ppStmt.setString(4, "S7N 5C9");
				int affected = ppStmt.executeUpdate();
				if (affected > 0) {
					System.out.println("New branch added successfully!");
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
