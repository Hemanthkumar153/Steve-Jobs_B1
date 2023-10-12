package collections;
import java.util.*;


public class Collections {
	public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(20);
	list.add("I LOVE YOU GEETA ");
	list.add(40);
	list.add(50);
	System.out.println("List Data : "+list);
	
	List<Character> list1 = new ArrayList<Character>();
	list1.add('H');
	list1.add('E');
	list1.add('M');
	list1.add('A');
	list1.add('N');
	list1.add('T');
	list1.add('H');
	
	List list2 = new ArrayList(list);
	System.out.println("List Data 2 :"+list2);
	System.out.println("List Data 1 : "+list1);
	
	Set set =  new TreeSet();
	set.add("code");
	set.add("code");
	set.add("Hemanth");
	set.add("Sreemath");
	set.add("Mohan");
	set.add("Vamsi");
	set.add("Azeez");
	System.out.println("Set Data :"+set);
	
	
	Set set1 = new HashSet();
	set1.add(12);
	set1.add(13);
	set1.add("Hemanth");
	set1.add("Hyderabad");
	set1.add("America");
	set1.add(5.5);
	set1.add(true);
	set1.add(123456789);
	set1.add(4.5555555);
	System.out.println("Set Data2 : "+set1);
	
	Map mapList = new HashMap();
	mapList.put("Name","Hemanth");
	mapList.put("Id",123);
	mapList.put("Gender",'m');
	System.out.println("MapList Data :"+mapList);
	
	Map<String,String> mapList1 = new HashMap<String,String>();
	mapList1.put("name","fhfhgj");
	mapList1.put("id","122");
	System.out.println("MapList Generic :"+mapList1);
	
	Map<Integer,Map> mapOfMap = new HashMap<Integer,Map>();
	mapOfMap.put(5, mapList);
	mapOfMap.put(2, mapList1);
	System.out.println("MAP OF MAP :"+mapOfMap);
	

	
}
}