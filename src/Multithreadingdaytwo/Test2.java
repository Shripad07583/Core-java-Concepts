package Multithreadingdaytwo;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("main thread");
		
		Animal2 animalThread = new Animal2();
		
		Thread t = new Thread(animalThread);
		
		t.start();
	}

}
