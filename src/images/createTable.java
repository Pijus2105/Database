package images;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createTable {
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
    
    String query3 = "create table images(id int primary key auto_increment, pic blob)";
    
    PreparedStatement stmtn = con.prepareStatement(query3);
    
    stmtn.executeUpdate();
    
    System.out.println("Table created Established successfully");
    
    con.close(); // close connection
    System.out.println("Connection Closed....");
	} catch (Exception e) {
		e.printStackTrace();
	}
		 
	 }

}
