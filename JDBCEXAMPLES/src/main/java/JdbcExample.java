import java.sql.*;
import java.util.ArrayList;
import JDBC.JDBC1;
public class JdbcExample {
	ArrayList< JDBC1> arrayList = new ArrayList< JDBC1>();
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String dbURL = "jdbc:mysql:// 192.168.0.128:3306/codebegun";
		String userName = "root";
		String password = "Hemanth@143";
		String query = "select * from studentinfo";
		
		try {
			//Class.forName ("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(dbURL, userName, password );
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				 JDBC1 jdbc1 = new  JDBC1();
				System.out.println(resultSet.getString("studentId"));
				System.out.println(resultSet.getString("studentName"));
				System.out.println(resultSet.getString("Gender"));
				System.out.println(resultSet.getString("Age"));
				System.out.println(resultSet.getString("MobileNumber"));
				System.out.println("----------------------------------");
			}
			}
		     catch(Exception e) {
				e.printStackTrace();
			}
		     finally {
				resultSet.close();
				connection.close();
				statement.close();
			}
	}

}
 