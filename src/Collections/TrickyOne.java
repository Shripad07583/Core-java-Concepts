package Collections;

import java.util.ArrayList;
import java.util.List;

public class TrickyOne {
	
	//Store even numbers from 1 to 20 in a list and print list using for each loop
	
	public static void main(String[] args) {
		
		//1. numbers 1 - 20
		//2. filter even number
		//3. store even number in list
		//4. print list
		
		
		List<Integer> evenNoList = new ArrayList<Integer>();
		
		for(int i = 1; i<=20; i++) {
			if(i%2==0) {
				
				evenNoList.add(i);
			}
		}
		
		for(int x : evenNoList) {
			System.out.println(x);
		}
		
	}

}
