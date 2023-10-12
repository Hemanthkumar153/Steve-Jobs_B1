package Practise;

public class Employee {
 private String firstname;
 private String lastname;
 private int age;
 public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(int mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
private int mobilenumber;
 private String gender;
}

class Access{
	
	public static void main(String []args) {
		Employee employee = new Employee();
		employee.setFirstname("Hemanth");
		employee.setLastname("Vedula");
		employee.setAge(21);
		employee.setGender("Male");
		System.out.println("First Name : "+employee.getFirstname());
		System.out.println("Last Name : "+employee.getLastname());
		System.out.println("Age : "+employee.getAge());
		System.out.println("Gender : "+employee.getGender());
	}
}