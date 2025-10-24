package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class CountEvenNumbers {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(12);
		s.add(13);
		s.add(56);
		s.add(45);
		s.add(20);
		
		int count = 0;
		
		for(int a : s) {
			if(a%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
