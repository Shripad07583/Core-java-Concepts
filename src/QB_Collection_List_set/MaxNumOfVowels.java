package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class MaxNumOfVowels {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Shripad");
		s.add("Rajeshwar");
		s.add("Boral");
		
		String maxWord = "";
		int maxVowels = 0;
		
		for(String a : s) {
			int count = 0;
			for(char c : a.toLowerCase().toCharArray()) {
				if("aeiou".contains(c + "")) {
					count++;
				}
			}
			if(count > maxVowels) {
				maxVowels = count;
				maxWord = a;
			}
		}
		System.out.println(maxWord);
		
		
	}

}
