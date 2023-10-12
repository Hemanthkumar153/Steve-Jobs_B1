
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
      import JDBC.JDBC1;

	public class JdbcInsert {

		public static void main(String[] args)throws SQLException {
			// TODO Auto-generated method stub
			Connection connection = null;
			Statement statement = null;
			PreparedStatement preparedStatement = null; 
			ResultSet resultSet = null;
			String dbURL = "jdbc:mysql://192.168.0.128:3306/codebegun";
			String userName = "root";
			String userPassword = "Hemanth@143";
			String query = "select * from student_info";
			String queryInsert = "insert into student_info(studentIdOne,studentName,Gender,Age,MobileNumber,EmailId)"
					+ "values(?,?,?,?,?,?,?,?,?,?)";
//			String queryInsert = "insert into student_info(studentYearOfJoining,courseId) values(?,?)";
			
			try {
				connection = DriverManager.getConnection(dbURL, userName, userPassword);
				preparedStatement = connection.prepareStatement(queryInsert);

				preparedStatement.setString(1,"TestStdId");
				preparedStatement.setString(2,"Hemanth");
				preparedStatement.setString(3,"Male");
				preparedStatement.setInt(4,21);
				preparedStatement.setLong(5,82474128);
				preparedStatement.setString(6,"hemanth@gmail.com");
				

				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				int resultInsert = preparedStatement.executeUpdate();
				System.out.println("********: "+resultInsert);
				
//				int incr = 1;
				   JDBC1 jdbc1 = new JDBC1();
				
				while(resultSet.next()) {
					//System.out.println(resultSet.getInt("studentInfoId"));
					List<JDBC1> userInfoList = new ArrayList();
					System.out.println(resultSet.getInt("studentIdOne"));
					System.out.println(resultSet.getString("studentName"));
					System.out.println(resultSet.getString("gender"));
					System.out.println(resultSet.getInt("age"));
					System.out.println(resultSet.getLong("mobilenumber"));
					System.out.println(resultSet.getString("emailid"));
					System.out.println("--------------------------------------");
					
//					String newObject = "userInfo" + incr;
					
				
//					incr++;
					
				   jdbc1.setStudentIdOne(resultSet.getInt("studentIdOne"));
				   jdbc1.setStudentName(resultSet.getString("studentName"));
				   jdbc1.setGender(resultSet.getString("gender"));
				   jdbc1.setAge(resultSet.getInt("age"));
				   jdbc1.setMobileNumber(resultSet.getLong("mobilenumber"));
				   jdbc1.setEmailid(resultSet.getString("emailid"));
					
					
				   userInfoList.add(jdbc1);				
				}
				for(JDBC1 userInfoVariable: userInfoList) {
					System.out.println("StudentIdOne: "+userInfoVariable);
					System.out.println("StudentName: "+userInfoVariable.studentName);
					System.out.println("Gender: "+userInfoVariable.gender);
					System.out.println("Age: "+userInfoVariable.age);
					System.out.println("MobileNumber: "+userInfoVariable.mobilenumber);
					System.out.println("Emailid: "+userInfoVariable.emailid);
					
					System.out.println("-----");
				}
						
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				connection.close();
				statement.close();
//				preparedStatement.close();
				resultSet.close();
				
			}
			

		}

	}


