package QB_While_Loop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = sc.nextInt();
		
		int original = a;
		
		int reverse = 0;
		
		while(original != 0) {
			
			int digit = original % 10;
			
			reverse = reverse * 10 + digit;
			
			original = original / 10;
			
		}
		if(a==reverse) {
			System.out.println(a+ " is a palandrome.");
		}
		else {
			System.out.println(a+ " is not a palandrome/");
		}
	}

}
