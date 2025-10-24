package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class FirstName {
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		s.add("Shripad Boral");
		s.add("John Doe");
		s.add("Mohommad Siraj");
		s.add("Virat Kohli");
		
		for(String name : s) {
			String[] parts = name.split(" ");
			if(parts.length> 0) {
				System.out.println(parts[0]);
			}
		}
		
	}

}
