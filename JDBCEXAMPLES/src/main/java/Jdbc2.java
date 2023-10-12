	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import JDBC.JDBC1;
	public class Jdbc2 {
		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
//			PreparedStatement statement=null;
			ResultSet resultset=null;
			String dburl="jdbc:mysql://192.168.0.128:3306/codebegun";
			String username="root";
			String password="Hemanth@143";
			String query="select * from studentinfo";
//			String insertquery="select*from student(StudentID,FirstName,Email) values (?,?)";
			try {
				connection=DriverManager.getConnection(dburl,username,password);
				statement=connection.createStatement();
//				statement=connection.prepareStatement(insertquery);
				resultset=statement.executeQuery(query);
				
				
				
				
				while(resultset.next()) {
					
					JDBC1 jdbc1=new JDBC1();
					//jdbc1.setStudentIdOne(resultset.getInt("studentIdOne"));
					jdbc1.setStudentName(resultset.getString("studentName"));
					jdbc1. setGender(resultset.getString("gender"));
					jdbc1.setMobileNumber(resultset.getLong("Mobilenumber"));
					jdbc1.setAge(resultset.getInt("age"));
					
					
					List<JDBC1> list=new ArrayList<>();
					list.add(jdbc1);
					
					for(JDBC1 element: list) {
						//System.out.println("studentIdOne: "+element.getStudentIdOne());
						System.out.println("StudentName: "+element.getStudentName());
						System.out.println("Gender: "+element.getGender());
						System.out.println("Mobile: "+element.getMobileNumber());
						System.out.println("Age: "+element.getAge());
						System.out.println("----------------------");

						
					}
					
//					statement.setInt(0, 30);
//					statement.setString(1, "Azzez");
//					statement.setString(2, "azzez@gmail.com");
//					
//					int result=statement.executeUpdate();
					
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				connection.close();
				statement.close();
				resultset.close();
				
				
			}
		}

	}

