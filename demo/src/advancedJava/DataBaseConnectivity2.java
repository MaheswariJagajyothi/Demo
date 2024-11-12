package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity2 {

	static final String url="Jdbc:mysql://localhost/company";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) 
	{
		// Database Creation 
		
		// TODO Auto-generated method stub
		try(Connection c=DriverManager.getConnection(url, userName, password);
				Statement s=c.createStatement();)
		{
			String query="CREATE DATABASE STUDENTS";
			s.executeUpdate(query);
			System.out.println("Database created Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
