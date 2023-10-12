package Practise;

public class RegistrationProcess {

	    StudentInfo saveUserInfo() {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setStudentName("Jhonwick");
		studentInfo.setCollegeName("Raghu Engineering College");
		studentInfo.setStudentid("19981a04o3");
		studentInfo.setCourseName("B.Tech");
		studentInfo.setAdressInfo(getAdressInfo());
		studentInfo.setRegisterInfo(getRegisterInfo());
		return studentInfo;
	    }
		private RegisterInfo getRegisterInfo() {
		RegisterInfo registerInfo = new RegisterInfo();
		registerInfo.setFirstName("Hemanth Kumar");
		registerInfo.setLastName("Vedula");
		registerInfo.setAge(21);
		registerInfo.setEmail("hemanthkumar2235@gmail.com");
		registerInfo.setGender('M');
		return registerInfo;
		}
		private AdressInfo getAdressInfo() {
		AdressInfo adressInfo = new AdressInfo();
		adressInfo.setDoorNo("54-9-22");
	    adressInfo.setArea("Isukathota");
		adressInfo.setCity("Visakhapatnam");
		adressInfo.setDistrict("AndhraPradesh");
		adressInfo.setPincode("530022");
		adressInfo.setLandmark("Landmark");
		return adressInfo;
		}
		}

		

