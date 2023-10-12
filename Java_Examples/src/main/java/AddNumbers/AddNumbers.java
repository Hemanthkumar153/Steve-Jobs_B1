package AddNumbers;
import java.util.Scanner;

public class AddNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter to Numbers :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = a + b;
	System.out.println("Addition Of Two Numbers :"+ c);
}
}
