package ExceptionHandling;

public class Throws {
	
		
		static void checkAge(int a) {
			
			if(a<18) {
				throw new ArithmeticException("Access Not Denied");
				
			}
			else {
				System.out.println("Access Denied");
			}
			
		}
	public static void main(String[]args) {
		checkAge(15);
	}

	}


