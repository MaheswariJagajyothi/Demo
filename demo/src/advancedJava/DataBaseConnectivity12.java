package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity12 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// Adding column and values to that column
		String url = "Jdbc:mysql://localhost/Institute";
		String userName="root";
		String password="";
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is Established successfully");
			
			Statement statement = con.createStatement();
			
			String query = "alter table training add training_location varchar(250)";
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate(query);
			System.out.println("Column is added");
			
			query = "update training set training_location='Pune' where training_id=111";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate(query);
			
			query = "update training set training_location='Bengalore' where training_id=112";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate(query);
			
			query = "update training set training_location='Chennai' where training_id=113";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate(query);
			
			query = "update training set training_location='Mumbai' where training_id=114";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.executeUpdate(query);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
