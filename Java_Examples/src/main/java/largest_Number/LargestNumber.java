package largest_Number;
import java.util.Scanner;
    public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("Enter the array : ");
		
		int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = findMax(arr);
        System.out.println("The biggest number in the array is: " + max);
	}
	
	        public static int findMax(int[] arr) {
	       
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	 }
    }

