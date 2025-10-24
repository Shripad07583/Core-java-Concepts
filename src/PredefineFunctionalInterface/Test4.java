package PredefineFunctionalInterface;

import java.util.function.Supplier;

// Supplier interface
public class Test4 {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> {
			return 12;
		};
		int result = s.get();
		System.out.println(result);
		
	}

}
