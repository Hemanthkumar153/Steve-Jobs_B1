package arithOperations;

public class LogicalOperators {

	void andLogic(int a, int b, int c,int d) {
		if ((a>b)&&(b==c)) {
			d = a+b+c;
			System.out.println("Condition is True :"+d);
		}
			else {
		    System.out.println("Condition is False ");	
		}
	}
	
	void orLogic(int a, int b, int c,int d) {
		if ((a>b) || (b==c)) {
			d = a+b+c;
			System.out.println("Condition is True :"+d);
		}
			else {
		    System.out.println("Condition is False ");	
		}
	}
	
	void notLogic(int a, int b, int c,int d) {
		if ((a>b) != (b==c)) {
			d = a+b+c;
			System.out.println("Condition is True :"+d);
		}
			else {
		    System.out.println("Condition is False ");	
		}
	}
}
