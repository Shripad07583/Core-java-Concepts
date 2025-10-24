package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class Fruits {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Apple");
		s.add("Banana");
		s.add("Pineapple");
		s.add("Chiku");
		
		for(String a : s) {
			System.out.println(a);
		}
		
		
	}

}
