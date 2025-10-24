package Multithreadingdaytwo;

public class Animal1 extends Thread {

	
	//Thread creation by extend keyword
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println(i + " : " + Thread.currentThread().getName());
		}

	}
	
	

}
