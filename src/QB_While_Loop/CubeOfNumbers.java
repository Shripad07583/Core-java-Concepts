package QB_While_Loop;

import java.util.Scanner;

public class CubeOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number to print cube : ");
		
		int a = sc.nextInt();
		int i = 1;
		
		while(i<=a) {
			
			int cube = a*a*a;
			
			System.out.println("the cube of this number is : " + cube);
			
			i++;
		}
		
	}

}
