package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class AddSet {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(12);
		s.add(34);
		s.add(56);
		s.add(12);
		s.add(56);
		
		System.out.println(s);
		
		
		
		
	}

}
