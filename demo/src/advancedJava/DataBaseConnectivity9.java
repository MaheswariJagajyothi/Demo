package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity9 {

	static final String url="Jdbc:mysql://localhost/";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection c=DriverManager.getConnection(url, userName, password);
				Statement s=c.createStatement();)
		{
			String query="CREATE DATABASE Institute";
			s.executeUpdate(query);
			System.out.println("Database created Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
