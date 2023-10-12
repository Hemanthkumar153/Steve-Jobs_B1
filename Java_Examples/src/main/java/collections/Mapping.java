package collections;
import java.util.*;

public class Mapping {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "KING");
		map.put(2, "QUEEN");
		map.put(3, "MINISTER");
		map.put(4, "PRINCE");
		System.out.println("MAP DATA : "+map);
		for(Map.Entry<Integer, String> entry : map.entrySet());
		System.out.println("Key = " + map.entry.getKey() + ", Value = " + entry.getValue());
	}
}
