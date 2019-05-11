
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		String dbUrl = "jdbc:oracle:thin:@//localhost:49161/xe";
		String user = "OVCASUS";
		String pass = "ovcasus";

		try {
			// 1. Get a connection
			Connection myConn = DriverManager.getConnection(dbUrl, user, pass);
			// 2. Create a statement
			Statement myStatement = myConn.createStatement();
			// 3. Execute SQL query
			ResultSet myRs = myStatement.executeQuery("select * from OV_CHIPKAART");
			// 4. Process result set
			while (myRs.next()) {
				System.out.println(myRs.getString("kaartnummer"));
				System.out.println(myRs.getString("klasse"));
				
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
