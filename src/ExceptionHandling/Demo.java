package ExceptionHandling;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("code started");
		
		int a = 12;
		
		
		try {
			int div = 12/0;
			System.out.println(div);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		
		finally {                              //resources close krnya sathi
			System.out.println("finally block");
		}
		
		System.out.println("code completed");
		
		int mul = 12*3;
		System.out.println(mul);
	}

}
