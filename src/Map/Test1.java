package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "Monday");
		m.put(103, "Wednesday");
		m.put(102, "Tuesday");
		
		
		System.out.println(m.toString());
		
		
		
		
		Map<Integer, String> m1 = new LinkedHashMap();
		m1.put(101, "Monday");
		m1.put(103, "Wednesday");
		m1.put(102, "Tuesday");
	
		
		System.out.println(m1.toString());
		
		
		
		
		
		Map<Integer, String> m2 = new TreeMap<Integer, String>();
		m2.put(101, "Monday");
		m2.put(103, "Wednesday");
		m2.put(102, "Tuesday");
	
		
		System.out.println(m2.toString());
		

		
		
		
	}

}
