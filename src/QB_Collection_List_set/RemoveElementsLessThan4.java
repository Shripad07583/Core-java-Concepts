package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsLessThan4 {
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		s.add("Shripad");
		s.add("Fan");
		s.add("rat");
		s.add("Boral");
		
		List<String> s1 = new ArrayList<String>();
		
		for(String a : s) {
			if(a.length()>=4) {
				s1.add(a);
			}
		}
		s.clear();
		s.addAll(s1);
		
		System.out.println("filgtered list : " + s);
		
	}

}
