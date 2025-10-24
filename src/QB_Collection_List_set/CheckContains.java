package QB_Collection_List_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckContains {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>(Arrays.asList("running" , "sit", "camping", "drink"));
		
		for(String a : s) {
			if(a.contains("ing")) {
				System.out.println(a);
			}
		}
		
	}

}
