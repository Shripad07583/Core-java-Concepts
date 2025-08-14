package QB_While_Loop;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i<=a) {
		     sum +=i;
			
			System.out.println("The sum of numbers from 1 to "+ a + " is : " + sum);
			
			i++;
		}
	}

}
