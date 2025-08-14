package QB_Do_while_loop;

import java.util.Random;

public class Dice {
	
	public static void main(String[] args) {
		
		Random a = new Random();
		
		int roll;
		
		do {
			roll = a.nextInt(6)+1;
			System.out.println("Rolled : " + roll);
		}
		while(roll != 6);
		System.out.println("you rolled a 6!");
		
		}
		
	}

