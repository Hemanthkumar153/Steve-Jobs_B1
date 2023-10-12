package operationsoper;
import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter the value of a and b :");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(b++ - --b + ++a + b--);
		
	}

}
