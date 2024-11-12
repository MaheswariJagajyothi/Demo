package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity11 {

	static final String url="Jdbc:mysql://localhost/Institute";
	static final String userName="root";
	static final String password="";
 
	public static void main(String[] args) {
		
		//Inserting values into database
		
		try(Connection conn=DriverManager.getConnection(url, userName, password);
				Statement s=conn.createStatement();)
		{
			System.out.println("Inserting values...");
			String sql = "INSERT INTO TRAINING VALUES(111,'V&V Automation','3 Months','2024-10-07')";
			s.executeUpdate(sql);
			sql = "INSERT INTO TRAINING VALUES(112,'Selenium Java','2 Months','2024-10-08')";
			s.executeUpdate(sql);
			sql = "INSERT INTO TRAINING VALUES(113,'Java Full Stack','1.5 Months','2024-11-06')";
			s.executeUpdate(sql);
			sql = "INSERT INTO TRAINING VALUES(114,'Big Data','2.5 Months','2024-11-01')";
			s.executeUpdate(sql);
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}

 
	}

}
