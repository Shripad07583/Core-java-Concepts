package QB_While_Loop;

import java.util.Scanner;

public class FirstEvenNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Even Number : ");
		
		int a = sc.nextInt();
		int b = 0;
		int i = 0;
		while(b<a) {
			if(i%2==0) {
				System.out.println(i);
				b++;
			}
			
			i++;
			
		}
	}

}
