package largest_Number;

public class Largest_Number {
	
	int a = 10;
	int b = 50;
	int c  = 60;
	
	public void condition(int a,int b, int c) {
		if(a>=b && a>=c) {
			System.out.println("A is the largest number : "+a);
		}
		else if(b>=c && b>=a) {
			System.out.println("B is the largest number : "+b);
		}
		else {
			System.out.println("C is the largest number: "+c);
		}
	}
	

}
