package QB_While_Loop;

import java.util.Scanner;

public class NaturalNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first natural number : ");
		
		int a = sc.nextInt();
		
		int i = 1;
		
		while(i<=a) {
			System.out.println(i);
			i++;
			
		}
	}

}
