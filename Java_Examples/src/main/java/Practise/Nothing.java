package Practise;
import java.util.Scanner;

	    public class Nothing {

	
	    public static void main(String[] args) {
	    	int choice=1;
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        

	        while (choice == 1) {
	            System.out.print("Enter a number : ");
	            int number = scanner.nextInt();
	            
	            if (number >= 0) {
	               int factorial = calculateFactorial(number);
	                System.out.println("Factorial of " + number + " is: " + factorial);
	            } else {
	                System.out.println("Please enter a non-negative integer.");
	            }

	            System.out.println("Press 1 to calculate another factorial or 2 to exit: ");
	            choice = scanner.nextInt();
	        }

	        System.out.println("Exiting the program.");
	    }

	    private static int calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } 
	        else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}




