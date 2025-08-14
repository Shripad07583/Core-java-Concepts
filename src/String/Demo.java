package String;

public class Demo {
	public static void main(String[] args) {
		
		String s = "Shripad Boral";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat("is a Great Man"));
		char a = s.charAt(3);
		System.out.println(a);
		System.out.println(s.endsWith("l"));
		System.out.println(s.contains(s));
	}

}
