package PredefineFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Consumer interface
public class Test3 {
	
	public static void main(String[] args) {
		
		Consumer<String> c = x -> System.out.println(x);
		c.accept("Wednesday");
		
		
		
		List<Integer> list = Arrays.asList(12,13,14,15,15,16,17,18);
		
		Consumer<List<Integer>> ca = (x) -> {
			for( int a : x) {
				System.out.println(a);
			}
		};
		ca.accept(list);
		
	}

}
