package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity4 {

	static final String url="jdbc:mysql://localhost/";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) throws SQLException
	{
		
		// To Print All The Databases present in localhost
		
		try(Connection conn=DriverManager.getConnection(url,userName,password);)
		{
			System.out.println("Connected db successfully");
			System.out.println();
			Statement stmt=conn.createStatement();
			ResultSet rs1=stmt.executeQuery("SHOW DATABASES");
			System.out.println("DATABASES");
			while(rs1.next()) {
				System.out.println(rs1.getString(1));
			}
		}
		
	}

}
