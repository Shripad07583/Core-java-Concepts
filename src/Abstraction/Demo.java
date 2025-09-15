package Abstraction;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee type : ");
		System.out.println("1. Manager");
	    System.out.println("2. HR");
	    System.out.print("Enter your choice (1 or 2): ");
		
		int choice = sc.nextInt();
		
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		
		Employee e;
		
		if(choice == 1) {
			e = new Manager(salary);
			e.printSalary(salary);
			e.calculateSalary();
		}
		else if(choice == 2) {
			e = new HR(salary);
			e.printSalary(salary);
			e.calculateSalary();
		}
		else {
			System.out.println("invalid choice.");
		}
		
	}

}
