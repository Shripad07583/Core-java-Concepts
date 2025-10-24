package Multithreadingdaytwo;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		for(int i = 0; i<10; i++) {
//			System.out.println("hello world");
//			Thread.sleep(10000); it is a static method
//		}
		
		Animal1 animal1 = new Animal1();
		animal1.start();
		
	}

}
