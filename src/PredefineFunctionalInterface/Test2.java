package PredefineFunctionalInterface;

import java.util.function.Function;

//Function interface
public class Test2 {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> square = x -> x*x;
		Integer a = square.apply(5);
		System.out.println(a);
		
		
		Function<String, Integer> alphabate = y -> y.length();
		System.out.println(alphabate.apply("Shripad"));
		
		Function<Integer, Integer> addTwo = x -> x+2;
		Function<Integer, Integer> addThree = x -> x+3;
		System.out.println(addTwo.andThen(addThree).apply(6));
	}

}
