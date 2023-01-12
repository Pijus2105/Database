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
//    String query
//    = "create table tableone(tId int(20) primary key auto_increment, tname varchar(200) not null , tcity varchar(400))";
//    Statement st = con.createStatement();
//    st.executeUpdate(query);
    
    String query2 = "insert into tableone(tname,tcity) values(?,?)"; //Dynamic Query
    
    PreparedStatement stmt = con.prepareStatement(query2);
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Name : - ");
    String readname = br.readLine();
    
    System.out.println("Enter city : - ");
    String readcity = br.readLine();
    
    stmt.setString(1, readname);
    stmt.setString(2, readcity);
    
    stmt.executeUpdate();
    System.out.println("Table created Established successfully");
    // Execute query
    //rs.next();
    //String name         = rs.getString("name"); // Retrieve name from db

   // System.out.println(name); // Print result on console
  //  st.close(); // close statement
    con.close(); // close connection
    System.out.println("Connection Closed....");
	} catch (Exception e) {
		e.printStackTrace();
	}
		 
	 }

}
