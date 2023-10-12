package Practise;

public class TestOne {
	static int a = 10,b = 20;


    public static void main(String[] args) {
    	
    	SingleTon st = SingleTon.getInstance();
    	System.out.println("Add of Input1 and Input2 :"+(st.input1+st.input2));
    	Date dt = Date.ofPattern();
    	System.out.println(dt.ofPattern());
    }
}
