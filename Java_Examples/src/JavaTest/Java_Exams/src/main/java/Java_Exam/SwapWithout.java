package Java_Exam;
import java.util.Scanner;

public class SwapWithout {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstNumber : ");
		int input1 = sc.nextInt();
		
		System.out.println("Enter the SecondNumber : ");
		int input2 = sc.nextInt();
		
		System.out.println("Before Swapping the Numbers : "+input1+" "+input2);
		
		input1 = input1 + input2;//10+20=30
		input2 = input1 - input2;//30-20=10
		input1 = input1 - input2;//30-10=20
		
		System.out.println("After Swapping the Numbers : "+input1+" "+input2);
	}

}
