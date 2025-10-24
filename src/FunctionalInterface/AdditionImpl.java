package FunctionalInterface;

public class AdditionImpl 
{
	
	public static void main(String[] args) {
		
		//() -> {} ==> Lambda Expression
		
		
		FIAddition f = ( a, b) -> {
			System.out.println(a+b);
		};
		
		f.addition(10, 12);
		
	}

//	@Override
//	public void addition(int a, int b) {
//		System.out.println(a+b);
//		
	//}

}
