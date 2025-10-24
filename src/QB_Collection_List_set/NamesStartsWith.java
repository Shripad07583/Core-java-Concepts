package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWith {
	
	public static void main(String[] args) {
		
		 List<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Andrew");
	        names.add("Charlie");
	        names.add("Anna");

	        for (String name : names) {
	            if (name.startsWith("A")) {
	                System.out.println(name);
	            }
	        }
		
	}

}
