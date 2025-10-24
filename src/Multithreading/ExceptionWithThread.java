package Multithreading;

public class ExceptionWithThread {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
