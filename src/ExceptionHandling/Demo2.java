package ExceptionHandling;

public class Demo2 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("inside try");
			System.exit(0);
		}
		finally {
			System.out.println("inside finlly");
		}
		
		
		
	}

}
