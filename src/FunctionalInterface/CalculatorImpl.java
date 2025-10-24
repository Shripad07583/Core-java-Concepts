package FunctionalInterface;

public class CalculatorImpl {
	
	public static void main(String[] args) {
		
		FICalculator Addition = ( a , b) -> {
			System.out.println(a+b);
		};
		
		Addition.operation(10, 10);
		
		FICalculator Substraction = (a , b) -> {
			System.out.println(a-b);
		};
		
		Substraction.operation(7, 5);
		
		FICalculator Multiplication = (a , b) -> {
			System.out.println(a*b);
		};
		
		Multiplication.operation(5, 5);
		
		FICalculator Division = (a , b) -> {
			System.out.println(a/b);
		};
		
		Division.operation(100, 5);
	}
	
	

}
