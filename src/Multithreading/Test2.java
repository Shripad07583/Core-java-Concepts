package Multithreading;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("START");
		
		Employee2 e = new Employee2();
		e.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("main method : " + Thread.currentThread().getName());
		}
		
		System.out.println("END");
		
	}

}
