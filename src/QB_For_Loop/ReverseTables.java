package QB_For_Loop;

import java.util.Scanner;

public class ReverseTables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input : ");
		
		int a = sc.nextInt();
		
		for(int i = 10; i>1; i--) {
			int num = i*a;
			System.out.println(num);
			
		}
	}

}
