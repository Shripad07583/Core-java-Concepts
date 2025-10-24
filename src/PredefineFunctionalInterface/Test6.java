package PredefineFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

// BI predicate function
public class Test6 {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b = (x,y) -> {
			int a = (x+y)/2;
			return a%2==0;
		};
		Boolean val = b.test(12,12);
		System.out.println(val);
		
		BiConsumer<Integer, Integer> c = (x,y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		c.accept(12, 12);
		
		
		BiFunction<Integer, Integer, Integer> d = (x,y) -> {
			int sum = x+y;
			return sum;
		};
		int sum = d.apply(12, 15);
		System.out.println(sum);
	}
	
}
