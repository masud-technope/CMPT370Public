package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

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
				String selectQuery = "select * from staff";
				Statement stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery(selectQuery);
				int rowcount = 0;
				while (results.next()) {
					System.out.println(results.getInt("staffNo") + "\t"
							+ results.getString("firstName") + "\t"
							+ results.getDate("dob") + "\t"
							+ results.getInt("salary"));
					rowcount++;
				}
				System.out.println("Total staffs:" + rowcount);
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
