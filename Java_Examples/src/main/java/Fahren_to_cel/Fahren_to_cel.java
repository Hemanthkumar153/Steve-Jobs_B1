package Fahren_to_cel;
import java.util.Scanner;
	
	    public class Fahren_to_cel {

		public static void main(String arg[])	
		{
		    double a,c;
	             	    Scanner sc=new Scanner(System.in);	   	 
		    System.out.println("Enter  Fahrenheit temperature :");
	                   a=sc.nextDouble(); 
		    System.out.println("Celsius temperature is = "+celsius(a));		  	  	     
		} 
		static double celsius(double f) {
		return  (f-32)*5/9;
		}
	}	
	
	

