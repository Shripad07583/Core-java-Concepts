package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class CountCharacters {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Shripad");
		names.add("rajeshwar");
		names.add("sapna");
		names.add("prasad");
		names.add("raju");
		names.add("ram");
		names.add("Shruti");
		
		for(String a : names) {
			if(a.length()>5) {
				System.out.println(a);
			}
		}
		
	}

}
