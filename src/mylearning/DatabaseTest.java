package mylearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// will run only when the database is connected
public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("databaseurl", "databseuser", "daatbasepassword");
			Statement stmt = con.createStatement();
			int update = stmt.executeUpdate("Update column = abc where cd = my");
			ResultSet rt = stmt.executeQuery("select * from Xyz");
			//different queries and return type to run queries
			//there is also concept for prepare statement at below URL
			//https://www.javatpoint.com/PreparedStatement-interface
			while (rt.next())
			{   System.out.println(rt.getString("username"));
			System.out.println(rt.getString("password"));
			
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
