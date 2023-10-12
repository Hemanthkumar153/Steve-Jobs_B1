package Practise;

public class Main {
	    public static void main(String[] args) {
		RegistrationProcess registrationProcess = new RegistrationProcess();
		System.out.println( registrationProcess.saveUserInfo().getRegisterInfo().getFirstName());
		System.out.println( registrationProcess.saveUserInfo().getRegisterInfo().getLastName());
		System.out.println( registrationProcess.saveUserInfo().getRegisterInfo().getAge());
		System.out.println( registrationProcess.saveUserInfo().getRegisterInfo().getGender());
		System.out.println( registrationProcess.saveUserInfo().getRegisterInfo().getEmail());
}
}
