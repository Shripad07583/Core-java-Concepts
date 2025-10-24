package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateListToSet {
	
	public static void main(String[] args) {
		
		
		List<Integer> la = new ArrayList<Integer>();
		
		la.add(12);
		la.add(45);
		la.add(45);
		la.add(38);
		la.add(12);
		
		Set<Integer> a = new HashSet<Integer>(la);
		
		System.out.println("List with duplicate: " + la);
		
		System.out.println("Set without duplicates : " + a);
	}

}
