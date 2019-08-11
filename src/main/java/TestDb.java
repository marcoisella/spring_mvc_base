import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDb {
	public static void main(String a[]) {
		String username = "root";
		String password = "password";
		String connString = "jdbc:mysql://" + "localhost" + ":" + "3306" + "/"
				+ "fitnesstracker";
		String JDBCDriver = "com.mysql.cj.jdbc.Driver";

		try {
			// Try and load the JDBC driver
			Class.forName(JDBCDriver);

			// Try and actually connect
			DriverManager.getConnection(connString, username, password);
			System.out.println("Connected Successfully");
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver not found: " + ex);
		}
	}
} // end
