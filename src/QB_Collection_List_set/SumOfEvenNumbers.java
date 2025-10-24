package QB_Collection_List_set;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(12);
		l.add(35);
		l.add(10);
		l.add(2);
		
		int sum = 0;
		
		for(int a : l) {
			if(a%2==0) {
				sum += a;
				System.out.println("Even Number : " + a);
			
			}
		}
		System.out.println("Sum of Even Numbers : " + sum);
	}

}
