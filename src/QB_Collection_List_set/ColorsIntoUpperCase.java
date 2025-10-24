package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class ColorsIntoUpperCase {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		s.add("red");
		s.add("orange");
		s.add("black");
		s.add("green");
		
		Set<String> s1 = new HashSet<String>();
		
		for(String element : s) {
			s1.add(element.toUpperCase());
		}
		
		System.out.println("original : " + s);
		System.out.println("new set : " + s1);
	}

}
