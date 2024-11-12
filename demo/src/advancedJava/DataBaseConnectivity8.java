package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBaseConnectivity8 {

	static final String url ="Jdbc:mysql://localhost/students";
	static final String userName="root";
	static final String password = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//updation using PreparedStatement interface object
		try
		{
			Connection conn = DriverManager.getConnection(url,userName,password);
			String Query = "update registration set age= ? where id = ?";
			PreparedStatement prestmt = conn.prepareStatement(Query);
			prestmt.setInt(1, 27);
			prestmt.setInt(2, 101);
			prestmt.executeUpdate();
			Query="select * from registration";
			ResultSet result = prestmt.executeQuery(Query);
			while(result.next())
			{
				System.out.println("------------------------");
				System.out.println("ID::"+result.getInt(1));
				System.out.println("LastName::"+result.getString(2));
				System.out.println("FirstName::"+result.getString(3));
				System.out.println("Age::"+result.getInt(4));
			}
			result.close();
			prestmt.close();
			conn.close();  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
