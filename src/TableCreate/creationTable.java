package TableCreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class creationTable {

	public static void main(String[] args) {
		try {
			
			String url
	        = "jdbc:mysql://localhost:3306/sakila"; // table details
			 Class.forName(
			         "com.mysql.cj.jdbc.Driver");
	    String username = "root"; // MySQL credentials
	    String password = "2105";
	    // query to be run
	     // Driver name
	    Connection con = DriverManager.getConnection(
	        url, username, password);
	    System.out.println(
	            "Connection Established successfully");
	    
	    String query
	    = "create table tableone(tId int(20) primary key auto_increment, tname varchar(200) not null , tcity varchar(400))";
	    PreparedStatement stmt = con.prepareStatement(query);
	    stmt.executeUpdate(query);
	    	
	    
	    con.close(); // close connection
	    System.out.println("Connection Closed....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    

	}

}
