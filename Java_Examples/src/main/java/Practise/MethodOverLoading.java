package Practise;

public class MethodOverLoading {
public static void main(String[] args) {
	MethodOverLoading methodOverLoading = new MethodOverLoading();
	 methodOverLoading.add(2,"CODE", 0);
	 methodOverLoading.add(50, 60, 10);
	 methodOverLoading.add("Begun", 100, 'c');
}
void add(int a,String b,int c) {
	System.out.println(a+" "+b+" "+c);
	}
void add(int a,int b,int c) {
	System.out.println(a+b+c);
	}
void add(String a,int b,char c) {
	System.out.println(a+b+c);
	}
}
