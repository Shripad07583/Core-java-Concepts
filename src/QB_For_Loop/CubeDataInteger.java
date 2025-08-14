package QB_For_Loop;

import java.util.Scanner;

public class CubeDataInteger {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 4;
		
		for(int i = 1; i<=a; i++) {
			
			int cube = i*i*i;
			
			System.out.println(i+ " number is : " +i+ " and cube of " +i+ " is : " + cube);
			
			
		}
	}

}
