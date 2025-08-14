package QB_For_Loop;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = sc.nextInt();
		
		int original = a;
		
		int reverse = 0;
		
		for(;a != 0; a = a/10) {
			
			int digit = a %10;
			reverse = reverse*10+digit;
	
		}
		if(original == reverse) {
			System.out.println(original + " is a palindrome number");
		}
		else {
			System.out.println(original + " is not a palindrome number");
		}
	}

}
