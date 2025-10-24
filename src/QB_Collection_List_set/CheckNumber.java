package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class CheckNumber {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(12);
		s.add(34);
		s.add(10);
		s.add(55);
		
		int target = 10;
		boolean found = false;
		
		
		for(int a : s) {
			if(a == target) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(target + " Exists in the set");
		}
		else {
			System.out.println(target + " does not exists in the et");
		}
	}

}
