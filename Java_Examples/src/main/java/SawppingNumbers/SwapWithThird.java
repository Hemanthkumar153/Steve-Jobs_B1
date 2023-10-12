package SawppingNumbers;
import java.util.*;
public class SwapWithThird {
public static void main(String[] args) {
	 
	       int a, b, temp;// a and b are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of a and b :");  
	       a = sc.nextInt();  
	       b = sc.nextInt();  
	       System.out.println("Before swapping numbers: "+a +"  "+ b);  
	       /*swapping */  
	       temp = a;  
	       a = b;  
	       b = temp;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       
	    }    
	  
	
}

