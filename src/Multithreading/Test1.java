package Multithreading;

public class Test1 {
	
	public static void main(String[] args) {
		
		// multi threading => behaviour of your java code
		
		//single threaded environment
		System.out.println("name of thread : " + Thread.currentThread().getName());
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		Animal a = new Animal();
		a.getName();
		
		
		
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		
	}
	

}
