package images;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageInsert {

	public static void main(String[] args) {
		try {
			
			String url
	        = "jdbc:mysql://localhost:3306/sakila"; // table details
			 Class.forName(
			         "com.mysql.cj.jdbc.Driver");
	    String username = "root"; // MySQL credentials
	    String password = "2105";
	    
	    Connection con = DriverManager.getConnection(url, username, password);
	    
	    String query = "insert into images (pic) values (?)";
	    
	    PreparedStatement stmt = con.prepareStatement(query);
	    
	    FileInputStream fis = new FileInputStream("c:\\edc.jpg");
	    stmt.setBinaryStream(1,fis,fis.available());
	    
	    stmt.executeUpdate();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("Connection Established successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
