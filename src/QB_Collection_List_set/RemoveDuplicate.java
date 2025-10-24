package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		
		a.add("Shripad");
		a.add("ramesh");
		a.add("poonam");
		a.add("Shripad");
		
		List<String> b = new ArrayList<String>();
		
		for(String s : a) {
			if(!b.contains(s)) {
				b.add(s);
			}
		}
		System.out.println(b);
	}

}
