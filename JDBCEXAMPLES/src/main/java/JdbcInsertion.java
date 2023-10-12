import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import JDBC.JDBC1;
public class JdbcInsertion {
		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			PreparedStatement statement1=null;
			ResultSet resultset=null;
			String dburl="jdbc:mysql://192.168.0.128:3306/codebegun";
			String username="root";
			String password="Hemanth@143";
			String query="select * from studentinfo";
			String insertquery="select*from student(StudentID,FirstName,Email) values (?,?)";
			try {
				connection=DriverManager.getConnection(dburl,username,password);
				statement1=connection.createStatement();
//				statement=connection.prepareStatement(insertquery);
				resultset=statement1.executeQuery(query);
//					statement.setInt(0, 30);
//					statement.setString(1, "Azzez");
//					statement.setString(2, "azzez@gmail.com");
//					
//					int result=statement.executeUpdate();
					}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				connection.close();
				statement1.close();
				resultset.close();
		}
		}

	}



}
