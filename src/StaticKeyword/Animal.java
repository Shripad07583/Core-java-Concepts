package StaticKeyword;

public class Animal {
	
	static {
		System.out.println("static block ");
	}
	
	static {
		System.out.println("static block - 1");
	}
	
	static int agr = 22;
	
	public static void printName() {
		
		System.out.println("Shripad");
	}
	
	public Animal() {
		System.out.println("Constructor");
	}

}
