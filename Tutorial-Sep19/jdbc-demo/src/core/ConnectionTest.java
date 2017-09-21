package core;

import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) {

		String databaseURL = "jdbc:mysql://localhost:3308/cmpt370";
		String user = "root";
		String password = "pass370";
		
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		try {
			Class.forName(JDBC_DRIVER); //register the driver
			//establish the connection
			java.sql.Connection conn = DriverManager.getConnection(databaseURL,
					user, password);
			if (conn != null) {
				System.out.println("Connected to database successfully!");
				conn.close();
			}
		} catch (Exception exc) {
			System.err.println("Failed to connect:" + exc.getMessage());
			exc.printStackTrace();
		}
	}
}
