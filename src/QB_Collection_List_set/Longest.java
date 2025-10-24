package QB_Collection_List_set;

import java.util.Arrays;
import java.util.List;

public class Longest {
	
	public static void main(String[] args) {
		
		List<String> a = Arrays.asList("Shripad", "Likhit" , "Aniket", "Vedant", "Soham");
	
		String longname = a.get(0);
		
		for(String s : a) {
			
			if(s.length()>longname.length()) {
				longname = s;
			
			}
			
		}
		
		System.out.println(longname);
		
	}
}
