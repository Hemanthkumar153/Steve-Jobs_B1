package forLoop;
import java.util.Scanner;

public class Logic {
	public static void main (String[] args) {
	
	int[] arr = {17,19,15,31,32,5};
	
	
	int count = 0;
	
	for(int i = 0;i<arr.length;i++) {
		
		if(arr[i]==5) {
			count = count + 5;
			}
		
		else if(arr[i]%2==0) {
			count = count + 1;
		}
		
		else{
			count = count + 3;
		}
		  System.out.println(count);
	}
    

}
}
