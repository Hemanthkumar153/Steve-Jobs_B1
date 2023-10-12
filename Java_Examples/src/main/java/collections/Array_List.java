package collections;
import java.util.*;

public class Array_List {
	public static void main(String[] args) {
		List list = new ArrayList() ;
		list.add(20);
		list.add(30);
		list.add("HEMANTH");
		list.add("GEETA");
		System.out.println("ADDING ELEMENTS :"+list);
		list.remove(1);
		System.out.println("REMOVING ELEMENTS :"+list);
		list.set(0, 56);
		System.out.println("UPDATING ELEMENTS :"+list);
		list.get(0);
		System.out.println("GETTING :"+list);
		list.forEach(number->System.out.println(number));
		
		Set<String> set = new HashSet();
		set.add("KING");
		set.add("55");
		set.add("056");
		set.add("M");
		set.add("55");
		System.out.println("ADDING ELEMENTS :"+set);
		set.remove("55");
		System.out.println("REMOVING ELEMENTS :"+set);
		
		Map<Integer,String>
	}

}
