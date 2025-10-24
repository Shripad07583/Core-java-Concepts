package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		
		//HashSet -> seq. not maintained, duplicate not allowed, 1 null allowed
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(12);
		s.add(14);
		s.add(12);
		s.add(null);
		s.add(-23454);
		System.out.println(s.toString());
		
		
		//LinkedHashSet -> insert seq maintained, duplicacy NA,
		
		Set<Integer> sa = new LinkedHashSet<Integer>();
		sa.add(12);
		sa.add(14);
		sa.add(12);
		sa.add(null);
		sa.add(-23454);
		sa.add(null);
		System.out.println(sa.toString());
		
		
		//TreeSet -> sorted order, no null values allowed
		 
		Set<Integer> sb = new TreeSet<Integer>();
		sb.add(12);
		sb.add(14);
		sb.add(12);
		sb.add(null);
		sb.add(-23454);
		System.out.println(sb.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
