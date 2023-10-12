package Practise;
public class SingleTon {
	int input1 = 10;
	int input2 = 20;
	int input3;
	
   public  static SingleTon singleTon = null;

   private SingleTon(){
}
   
   public static SingleTon getInstance() {
	   if (singleTon == null) {
		   System.out.println("STOP");
		   return singleTon = new SingleTon();
		   }
	return singleTon;
   }
}