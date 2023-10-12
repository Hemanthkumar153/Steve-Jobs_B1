package ifelse;
import java.util.Scanner;

public class ifelse {
public static void main(String[] text) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int a = sc.nextInt();
	if(a%2==0){
	System.out.println("Number is Even");
	}
	else
	System.out.println("Number is odd");
		
}
}
