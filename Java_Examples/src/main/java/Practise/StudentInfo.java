package Practise;

    public class StudentInfo {
	private String StudentName;
	private String studentid;
	private String courseName;
	private String collegeName;
	private AdressInfo adressInfo;
	private RegisterInfo  registerInfo;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public AdressInfo getAdressInfo() {
		return adressInfo;
	}
	public void setAdressInfo(AdressInfo adressInfo) {
		this.adressInfo = adressInfo;
	}
	public RegisterInfo getRegisterInfo() {
		return registerInfo;
	}
	public void setRegisterInfo(RegisterInfo registerInfo) {
		this.registerInfo = registerInfo;
	}
	

}
