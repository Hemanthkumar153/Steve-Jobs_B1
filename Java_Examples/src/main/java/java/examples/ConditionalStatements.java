package java.examples;

public class ConditionalStatements {

	public static void main(String[] args) {
		ConditionalStatements conditionalStatements = new ConditionalStatements();
		conditionalStatements.main(20,40,60,80,100);

	}
		  void main(int a,int b,int c,int d,int e) {
			  
			  
			  if (a>b && a>c && a>d && a>e )
				  System.out.println("LARGEST NUMBER IS :"+ a);
			  else if (b>a && b>c && b>d && b>e )
				  System.out.println("LARGEST NUMBER IS :"+ b);
			  else if (c>a && c>b && c>d && c>e )
				  System.out.println("LARGEST NUMBER IS :"+ c);
			  else if (d>a && d>b && d>c && d>e )
				  System.out.println("LARGEST NUMBER IS :"+ d);
			  else
				  System.out.println("LARGEST NUMBER IS :"+ e);
			  
			
		}
}
