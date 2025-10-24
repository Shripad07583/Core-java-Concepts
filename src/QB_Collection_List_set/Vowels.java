package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Ram");
		s.add("raghu");
		s.add("supranakha");
		s.add("ice-cream");
		
		int totalNumbersOfVowels = 0;
		
		for(String a : s) {
			if(a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
				totalNumbersOfVowels++;
			}
		}
		System.out.println(totalNumbersOfVowels);
	}

}
