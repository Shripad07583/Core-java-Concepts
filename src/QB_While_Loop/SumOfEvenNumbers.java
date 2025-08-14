package QB_While_Loop;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		int a = sc.nextInt();
		
		int i = 2;
		
		int sum = 0;
		
		while(i<=a) {
				sum +=i;
				i += 2;
				System.out.println(sum);
			}
		}
	}

