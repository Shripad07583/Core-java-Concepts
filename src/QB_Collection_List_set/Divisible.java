package QB_Collection_List_set;

import java.util.Arrays;
import java.util.List;

public class Divisible {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,15,10,30,50,45);
		
		
		int count = 0;
		for(int a : l) {
			
			if(a%3==0 && a%5==0) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
