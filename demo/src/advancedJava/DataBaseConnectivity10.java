package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity10 {

	static final String url="jdbc:mysql://localhost/Institute";
	static final String userName="root";
	static final String password="";
	
	public static void main(String[] args) throws SQLException
	{
		
		// To create a table in database which is created using java
		
		try(Connection conn=DriverManager.getConnection(url,userName,password);
				Statement stmt=conn.createStatement();)
		{
			String query = "CREATE TABLE TRAINING "+
							"(training_id INTEGER ,"+
							"training_name VARCHAR(225),"+
							"training_duration VARCHAR(225),"+
							"training_date DATE,"+
							"PRIMARY KEY(training_id))";
			stmt.executeUpdate(query);
			System.out.println("Table is created successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}


}
