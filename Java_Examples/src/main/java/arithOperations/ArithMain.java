package arithOperations;


public class ArithMain extends ArithOperations {
	
public static void main(String[] args) {
	 
	 AssignmentOperators ao = new AssignmentOperators();
	 
	 System.out.println(ao.addAssign(10,55));
	 System.out.println(ao.subAssign(10,55));
	 System.out.println(ao.mulAssign(10,55));
	 System.out.println(ao.divAssign(10,55));
	 System.out.println(ao.modAssign(10,55));
	 
	 add();
     sub();
     mul();
     div();
     mod();
     
     LogicalOperators lo = new LogicalOperators();
     
     lo.andLogic(9, 10, 10, 0);
     lo.orLogic(9, 10, 10, 0);
     lo.notLogic(9, 10, 10, 0);
	 
     
     Class_B cb = new Class_B();

}

}
