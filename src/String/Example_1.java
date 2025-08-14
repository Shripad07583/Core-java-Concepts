package String;

public class Example_1 {
	public static void main(String[] args) {
		//s==s1 = true
		//s.equals(s1); = true
		String s = "shripad";
		String s1 = "shripad";
		
		
		
		//s==s1 = true
		//s.equals(s1); = true
		
		s = s.toUpperCase();
		System.out.println(s);
		
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		//s==s1 = will be false
		//s.equals(s1); = true
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}
