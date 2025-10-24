package QB_Collection_List_set;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(10);
		s.add(2);
		s.add(45);
		s.add(29);
		s.add(100);
		s.add(5);
		
		System.out.println("Prime numbers in the set : ");
		
		for(int num : s) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
		
	}

	private static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i = 2; i<=n/2; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

}
