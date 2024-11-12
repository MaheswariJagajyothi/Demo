package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConeectivity13 {

	static final String url= "Jdbc:mysql://localhost/Institute";
	static final String userName="root";
	static final String pass="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//updations
		
		try(Connection conn = DriverManager.getConnection(url, userName, pass);
				Statement stmt = conn.createStatement();)
		{
			
//			String Query = "UPDATE training set training_duration='3 Months' where training_name='Big Data'";
//			stmt.executeUpdate(Query);
//			
//			Query = "Alter table training rename to training_first";
//			stmt.executeUpdate(Query);
		    
			String Query = "Select training_duration,training_name from training_first";
			ResultSet result = stmt.executeQuery(Query);
			while(result.next())
			{
				System.out.println("------------------------------");
				System.out.println(result.getString("training_duration"));
				System.out.println(result.getString("training_name"));
				
			}
			
			Query = "Select training_name from training_first where training_name like 'J%'";
			result = stmt.executeQuery(Query);
			while(result.next())
			{
				System.out.println("------------------------------");
				System.out.println(result.getString("training_name"));
				
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
