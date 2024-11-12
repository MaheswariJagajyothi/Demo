package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DataBaseConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// Main Commands like alter, update, select Execution
		String url = "Jdbc:mysql://localhost/company";
		String userName="root";
		String password="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is Established successfully");
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery("select * from department");
			System.out.println("Department Table Data");
			while(set.next())
			{
				System.out.print(set.getInt("Dept_id")+"\t");
				System.out.print(set.getString("Dept_name")+"\t");
				System.out.print(set.getInt("Dept_hours")+"\t");
				System.out.println();
			}

			String query0 = "alter table department add salary int";
			PreparedStatement preparedStatement = con.prepareStatement(query0);
			preparedStatement.executeUpdate(query0);
			System.out.println("Column is added");
			preparedStatement.close();
			
			String query1 = "update department set salary='20000' where Dept_id=234";
			PreparedStatement preparedStatement1 = con.prepareStatement(query1);
			preparedStatement1.executeUpdate(query1);
			preparedStatement1.close();
			
			String query2 = "update department set salary='40000' where Dept_id=345";
			PreparedStatement preparedStatement2 = con.prepareStatement(query2);
			preparedStatement2.executeUpdate(query2);
			preparedStatement2.close();
			
			String query3 = "update department set salary='60000' where Dept_id=456";
			PreparedStatement preparedStatement3 = con.prepareStatement(query3);
			preparedStatement3.executeUpdate(query3);
			preparedStatement3.close();
			
			set = statement.executeQuery("select * from department");
			
			System.out.println();
			System.out.println("Department Table Data After Updation");
			while(set.next())
			{
				System.out.print(set.getInt("Dept_id")+"\t");
				System.out.print(set.getString("Dept_name")+"\t");
				System.out.print(set.getInt("Dept_hours")+"\t");
				System.out.print(set.getInt("salary")+"\t");
				System.out.println();
			}
			statement.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
