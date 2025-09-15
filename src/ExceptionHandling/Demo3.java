package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a : ");
			int a = sc.nextInt();
			int div = 12/a;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}
