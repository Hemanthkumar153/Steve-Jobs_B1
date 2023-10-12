package Practise;
import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice; 
        int input;

        while (true) {
        	 System.out.print("Enter a number : ");
            
            choice = sc.nextInt();
           
            if (choice == 1) {
                System.out.println("Please enter a number: ");
                input = sc.nextInt();
                int result = factorial(input);
                System.out.println("Factorial of " + input + " is: " + result);
            } 
            else  (choice == 2

            		
            		
            		
            		
            		
            		{
            	 System.out.println("For Continue press 1 or exit 2");
                System.out.println("Exiting the program.");
                break;  // Exit the loop when the user chooses 2
            } 
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
