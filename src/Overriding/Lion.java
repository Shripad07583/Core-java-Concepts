package Overriding;

public class Lion extends Animal {
	
	
	public Lion() {
		this(77);
	}
	
	public Lion(int a) {
		System.out.println("a in a constructor is : " + a);
	}
	
	
	public int number = 344;
	
	public void printColor() {
		System.out.println("black and white");
	}
	
	public void printSomething() {
		System.out.println("Something in the way");
		System.out.println(this.number);
		this.printColor();
		this.printName();
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("print name - Lion");
	}
	

}
