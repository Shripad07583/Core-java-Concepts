package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("shripad");
		l.add("rajeshwar");
		l.add("boral");
		
		for(String a : l) {
			
			String s = a.toUpperCase();
			
			System.out.println(s.toString());
		}
	}

}
