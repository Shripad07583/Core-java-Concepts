package QB_For_Loop;

import java.util.Scanner;

public class ReverseDigits {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a number to reverse digits : ");
		
		int a = sc.nextInt();
		
		int rev = 0; 
		
		for(;a != 0; a=a/10) {
			
			int digit = a%10;
			rev = rev * 10 + digit;
			
			System.out.println(rev);
		}
	}

}
