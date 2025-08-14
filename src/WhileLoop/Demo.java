package WhileLoop;

public class Demo {
	public static void main(String[] args) {
		
		
		int a = 1;
		
		while(a <= 10) {
			if(a==5) {
				a++;
				continue;        //break;
			}
		System.out.println(a);
		a++;
	}

}
	
}