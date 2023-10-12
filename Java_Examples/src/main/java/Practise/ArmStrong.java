package Practise;

import java.util.*;
public class ArmStrong {
   public static void main(String[] args) {
      
      int sum = 0; int choice = 1; int num;
    
      Scanner sc = new Scanner(System.in);
      
      while (choice == 1) {
      
      System.out.println("Enter a number to check Armstrong number: ");
   
      int number = sc.nextInt();
      
          if (getArmStrong()(input)) {
              System.out.println("ArmStrong!");
          } 
          else {
              System.out.println("Not a ArmStrong.");
          }
          System.out.println("enter the choice :: ");
          choice=sc.nextInt();
          }
          System.out.println("Exit the program :: ");
      }
      
      
      int copy = num;
     
      String n = Integer.toString(num);
     
      int len = n.length();
      if(sum == copy) {
          System.out.println(copy + " is an Armstrong number");
       } else {
          System.out.println(copy + " is not an Armstrong number");
       }
    
 
      
      public static int getArmStrong() {
      while(num != 0) {
         int rem = num % 10;
         int mul = 1;
         for(int i = 1; i <= len; i++) {
            mul *= rem;
         }
         sum += mul;
         num /= 10;
         return sum;
      }
      }
      
     