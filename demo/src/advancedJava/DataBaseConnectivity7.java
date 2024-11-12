package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity7 {

	static final String url= "Jdbc:mysql://localhost/students";
	static final String userName="root";
	static final String pass="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//updation using normal Statement Interface Object
		try(Connection conn = DriverManager.getConnection(url, userName, pass);
				Statement stmt = conn.createStatement();)
		{
			String Query = "UPDATE registration set age=30 where id in (100,101)";
			stmt.executeUpdate(Query);
			Query = "Select * from registration";
			ResultSet result = stmt.executeQuery(Query);
			while(result.next())
			{
				System.out.println("Employee Details");
				System.out.println(result.getInt("id"));
				System.out.println(result.getString("first"));
				System.out.println(result.getString("last"));
				System.out.println(result.getInt("age"));
				
			}
			result.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
