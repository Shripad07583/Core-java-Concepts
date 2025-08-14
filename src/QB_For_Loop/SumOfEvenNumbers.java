package QB_For_Loop;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Even number : ");
		
		int a = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 2; i<=a; i+=2) {
			if(a%2==0) {
				sum += i;
				System.out.println(sum);	
			}
			
			else {
				
				System.out.println("it is not a even number");
				
			}
			
		}
	}

}
