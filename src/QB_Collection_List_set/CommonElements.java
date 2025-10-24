package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
	
	public static void main(String[] args) {
		
		
		List<String> a = new ArrayList<String>();
		
		a.add("Table");
		a.add("Fan");
		a.add("chair");
		a.add("xtention");
		a.add("laptop");
		

		List<String> a1 = new ArrayList<String>();
		
		a1.add("bourn-vita");
		a1.add("Fan");
		a1.add("milton");
		a1.add("xtention");
		a1.add("myntra");
		
		List<String> commonElements =  new ArrayList<String>();
		
		for(String s : a) {
			if(a1.contains(s)) {
				commonElements.add(s);
			}
		}
		
		System.out.println("common elements : " + commonElements);
		
	}

}
