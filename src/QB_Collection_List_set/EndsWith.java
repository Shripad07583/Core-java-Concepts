package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class EndsWith {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("India");
		s.add("Russia");
		s.add("Ukrain");
		s.add("Shri-Lanka");
		s.add("Newzland");
		
		for(String r : s) {
			if(r.endsWith("a")) {
				System.out.println(r);
			}
		}
		
	}

}
