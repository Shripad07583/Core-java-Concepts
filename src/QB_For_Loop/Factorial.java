package QB_For_Loop;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find Factorial : ");
		
		int a = sc.nextInt();
		
		int factorial = 1;
		

		for(int i = 1; i<=a; i++) {
			
			
			factorial = factorial * i ;
			
			
			System.out.println(factorial);
			
		}
	}
	

}
