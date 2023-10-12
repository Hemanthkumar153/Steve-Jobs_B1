	package operationsoper;
    public class AddOfFractions {
    public static void main(String[] args) {
    	System.out.println(" 1 ");
    	double result = 1;
    	int count = 1;
    	int n = 10;
    	for(int i=1; i<n; i+=2) {
    		if(count%2!=0) {
    			System.out.print(" + ");
    			result = result + (1.0/i);
    		}
    		else {
    			System.out.print(" - ");
    			result = result - (1.0/i);
    		}
    		System.out.print(" 1/"+i);
    		count = count + 1;
    		
    	}
    		System.out.print(" = "+result);
    }
    }