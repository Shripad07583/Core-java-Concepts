package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class Prices {
	
	public static void main(String[] args) {
		
		List<Double> price = new ArrayList<Double>();
		
		price.add(100.0);
		price.add(2.56);
		price.add(150.9);
		price.add(19.9);
		price.add(167.9);
		price.add(50.9);
		
		for(double a : price) {
			if(a>=100) {
				System.out.println(a);
			}
		}
		
		
	}

}
