package QB_For_Loop;

import java.util.Scanner;

public class RaisedToPower {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the exponent : ");
		
		int b = sc.nextInt();
		
		int result = 1;
		
		
		for(int i = 1; i<=b; i++) {
			
			result*=a;
			
			System.out.println(result);
			
		}
	}

}
