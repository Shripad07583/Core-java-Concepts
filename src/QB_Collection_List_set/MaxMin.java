package QB_Collection_List_set;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	
	public static void main(String[] args) {
		
		List<Integer> la = Arrays.asList(12,3,4,5,6,7,8,9,77,56,0);
		
		
		int max = 0;
		int min = 0;
		
		for(int a : la) {
			
			if(a<min) {
				min = a;
			}
			if(a>max) {
				max = a;
			}
			
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		
	}

}
