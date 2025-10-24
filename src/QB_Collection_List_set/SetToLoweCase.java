package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class SetToLoweCase {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("TELEVISION");
		s.add("MOBILE");
		s.add("REMOTE");
		
		
		Set<String> s1 = new HashSet<String>();
		
		for(String a : s) {
			System.out.println(a.toLowerCase());
		}
	}

}
