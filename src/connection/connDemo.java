package connection;

import java.io.*;
import java.sql.*;

public class connDemo {
	
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


   // System.out.println("Connection Closed....");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
		 
	 }

}




//Statement st = con.createStatement();
//st.executeUpdate(query);

// String query2 = "insert into tableone(tname,tcity) values(?,?)"; //Dynamic Query

//String query3 = "create table images(id int primary key auto_increment, pic blob)"; 
// 
// 

//
//



// Execute query
//rs.next();
//String name         = rs.getString("name"); // Retrieve name from db

// System.out.println(name); // Print result on console
//  st.close(); // close statement
 // close connection