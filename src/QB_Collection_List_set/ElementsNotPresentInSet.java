package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementsNotPresentInSet {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		l.add(34);
		l.add(56);
		l.add(45);
		l.add(6);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(12);
		s.add(34);
		s.add(45);
		s.add(56);
		
		for(int a : l) {
			if(!s.contains(a)) {
				System.out.println("elements not present in the set : " + a);
			}
		}
		
		
	}

}
