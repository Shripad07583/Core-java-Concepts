package String;

public class Immutable_String {
	public static void main(String[] args) {
		
		String s = "shripad";
		System.out.println(System.identityHashCode(s));
		s = s.toUpperCase();
		System.out.println(s);
		
		
		s = s.toLowerCase();
		System.out.println(s);
		
		
		s = s.toUpperCase();
		System.out.println(s);
		
		
	}

}
