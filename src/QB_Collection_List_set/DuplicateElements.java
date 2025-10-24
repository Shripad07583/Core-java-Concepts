package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		s.add("Shripad");
		s.add("Rajeshwar");
		s.add("Shripad");
		s.add("Ram");
		s.add("Ram");
		
		
		List<String> duplicate = new ArrayList<String>();
		
		for(String a : s) {
			if(!duplicate.contains(a)) {
				duplicate.add(a);
			}
		}
		System.out.println(duplicate);
	}

}
