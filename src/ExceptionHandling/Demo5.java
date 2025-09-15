package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo5 {
	
	//compileTime using Throw
	
	public static void main(String[] args) {
		
		Demo5 a = new Demo5();
		try {
			a.anything();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void anything() throws FileNotFoundException {
		Demo5 a = new Demo5();
		a.something();
		
	}
	
	public void something() throws FileNotFoundException {
		
		FileReader reader = new FileReader("abc.txt");
	}

}
