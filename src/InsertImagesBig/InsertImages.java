package InsertImagesBig;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InsertImages {
	
	public static void main(String[] args) {
		
		try {
		Connection c = ConnectionProvider.getConnet();
		
		
		//String alter = "alter table images modify pic longblob";
		
		
		
		
//		String photos = "images";
//		
//		PreparedStatement psmt = c.prepareStatement("select * from " + photos);
//			
//		
//		ResultSet check = psmt.executeQuery();
		
		//ResultSetMetaData metaData = check.getMetaData();
		
//		byte s = (byte) psmt.executeLargeUpdate();
//		
//		if(s!=0) {
//			
//			String delete= "delete from images";
//			PreparedStatement deleteimage = c.prepareStatement(delete);
//			deleteimage.executeQuery();
			
			String insert = "insert into images(pic) values(?)";
			
			PreparedStatement insertimage = c.prepareStatement(insert);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			insertimage.setBinaryStream(1, fis, fis.available());
			
			insertimage.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "success");
			
			
		//}
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
