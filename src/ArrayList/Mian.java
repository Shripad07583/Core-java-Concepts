package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mian {
	
	//Ways to add data in array list
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		System.out.println(l.toString());
		
		List<Integer> la = new ArrayList<Integer>(100);
		
		la.add(13);
		la.add(14);
		
		List<Integer> lb = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		Integer[] array = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> lc = Arrays.asList(array);
		//lc.add(567);
		
		
	}
	
	

}
