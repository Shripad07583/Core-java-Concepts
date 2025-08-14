package QB_For_Loop;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a input : ");
		
		int a = sc.nextInt();
		
		for(int i = 1; i<=10 ; i++) {
			int num = i*a;
				System.out.println(num);
			}
			
		}
		
		
	}
