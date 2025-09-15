package Overloading;


//overloading - Compile time polymorphism

public class Calculator {
	//Example 1 - method overloading
	public void adiitiong(int a , int b) {
		int sum = a+b;
		System.out.println("Sum of two numbers : " +sum);
	}
	
	public void adiition(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum of two numbers : " +sum);
		
		
	}
	
	//Example 2 - method overloading seq of parameters changed
	
	
	public void printSomething(String name, int id) {
		
	}
	
	public void printSomething(int id, String name) {
		
	}


}

