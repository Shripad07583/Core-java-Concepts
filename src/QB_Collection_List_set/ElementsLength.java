package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class ElementsLength {
	
	public static void main(String[] args) {
		 
		Set<String> s = new HashSet<String>();
		
		s.add("Shripad");
		s.add("Ram");
		s.add("Lakhan");
		s.add("sita");
		s.add("sonu");
		s.add("gita");
		
		
		for(String a : s) {
			if(a.length()==4) {
				System.out.println(a);
			}
		}
		
	}

}
