package calculator;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int firstNumber = sc.nextInt();
	       

	        System.out.print("Enter operation  (+, -, *, /, %): ");
	        String operation = sc.next();
	        
	        System.out.print("Enter the second number: ");
	        int secondNumber = sc.nextInt();
	        
	        int result = operation(firstNumber, secondNumber, operation);
	        System.out.println("Your answer is: " + result);
	    }

	    public static int operation(int input1, int input2, String operation)
	    {
	        int result = 0;
	        if (operation.equals("+")) {
	            result = input1 + input2 ;
	        }
	        else if (operation.equals("-")) {
	            result = input1 - input2;
	        }
	        else if (operation.equals("*")) {
	            result = input1 * input2;
	        }
	        else if (operation.equals("%")) {
	            result = input1 % input2;
	        }
	        else if (operation.equals("/")) {
	            result = input1 / input2;
	        }
	        else {
	            System.out.println("Invalid");
	        }
	        return result;
	    }
	}


