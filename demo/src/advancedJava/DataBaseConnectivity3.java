package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity3 {

	static final String url="Jdbc:mysql://localhost/students";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) 
	{
		
		// To create connection to the Database which is created using Java 
		
		System.out.println("Connecting to a selected database");
		// TODO Auto-generated method stub
		try(Connection c=DriverManager.getConnection(url, userName, password);)
		{
			System.out.println("Database Connected Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
