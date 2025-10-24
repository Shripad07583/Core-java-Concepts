package Multithreading;

public class Employee2 extends Thread
{

	@Override
	public void start() {
		for(int i = 0; i<5; i++) {
			System.out.println("employee method : " + Thread.currentThread().getName());
		}
	}
	
	
	}


