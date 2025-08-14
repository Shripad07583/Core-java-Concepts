package StringFor;

import java.util.Scanner;

public class Task_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String a = sc.next();
		
		System.out.println("Enter your Last name : ");
		String b = sc.next();
		
		System.out.println("Enter your year of birth : ");
		int c = sc.nextInt();
		
		
		
		for(int i = 0; i<=0; i++) {
			System.out.print(b.charAt(i));
		}
		for(int j = 0; j<=3; j++) {
			System.out.print(a.charAt(j));
			
		}
		
		int ram = c%100;
		System.out.println(ram);
		
	
		
		
	}

}
