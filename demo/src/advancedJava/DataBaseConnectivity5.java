package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity5 {

	static final String url="jdbc:mysql://localhost/students";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) throws SQLException
	{
		
		// To create a table in database which is created using java
		
		try(Connection conn=DriverManager.getConnection(url,userName,password);
				Statement stmt=conn.createStatement();)
		{
			String query = "CREATE TABLE REGISTRATION "+
							"(id INTEGER not NULL,"+
							"first VARCHAR(225),"+
							"last VARCHAR(225),"+
							"age INTEGER,"+
							"PRIMARY KEY(id))";
			stmt.executeUpdate(query);
			System.out.println("Table is created successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
