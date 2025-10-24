package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementsPresentInBoth {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(12);
		l.add(13);
		l.add(45);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(676);
		s.add(24);
		s.add(12);
		
		for(int element : l) {
			if(s.contains(element)) {
				System.out.println("common elements : " + element);
			}
		}
	}

}
