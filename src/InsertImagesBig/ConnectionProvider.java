package InsertImagesBig;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection con;
	
	public static Connection getConnet() {
		
		if(con==null) {
			try {
				
				String url= "jdbc:mysql://localhost:3306/sakila"; // table details
				 Class.forName("com.mysql.cj.jdbc.Driver");
		    String username = "root"; // MySQL credentials
		    String password = "2105";
		    con = DriverManager.getConnection(url, username, password);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return con;
		
		
	}

}
