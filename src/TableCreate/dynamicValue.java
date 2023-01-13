package TableCreate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dynamicValue {

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
	    
	    String query2 = "insert into tableone(tname,tcity) values(?,?)"; //Dynamic Query
	    
	    PreparedStatement stmt = con.prepareStatement(query2);
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Name : - ");
	    String readname = br.readLine();

	    System.out.println("Enter city : - ");
	    String readcity = br.readLine();
	    
	    stmt.setString(1, readname);
	    stmt.setString(2, readcity);
	    
	    con.close(); // close connection
	    System.out.println("Connection Closed....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
