package QB_While_Loop;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for table 1 to 10 : ");
		
		int a = sc.nextInt();
		
		int i = 0;
		
		while(i<=10) {
			int num = i*a;
			
			System.out.println(num);
			
			i++;
			
			
		}
			
			
	}

}
