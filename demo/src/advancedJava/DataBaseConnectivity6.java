package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity6 {

	static final String url="Jdbc:mysql://localhost/students";
	static final String userName="root";
	static final String password="";
 
	public static void main(String[] args) {
		
		//Inserting values into database
		
		try(Connection conn=DriverManager.getConnection(url, userName, password);
				Statement s=conn.createStatement();)
		{
			System.out.println("Inserting values...");
			String sql = "INSERT INTO Registration VALUES(100,'Zara','Ali',18)";
			s.executeUpdate(sql);
			sql = "INSERT INTO Registration VALUES(101,'Mahnaz','Fatma',25)";
			s.executeUpdate(sql);
		}
		catch(SQLException e){
			e.printStackTrace();
		}

 
	}

}
