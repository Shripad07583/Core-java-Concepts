package Multithreadingdaytwo;

public class Test3 {
	
	public static void main(String[] args) {
		
		// As runnable is a functional interface then we can create a thread
		// using lambda as well
		
		Runnable r = () -> {
			
			for(int i = 0; i < 50; i++) {
				System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
