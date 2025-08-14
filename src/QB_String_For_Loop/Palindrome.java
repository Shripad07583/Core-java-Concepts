package QB_String_For_Loop;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a = "Shripad";
		
		String original = a;
		String reverse = "";
		
		for(int i = a.length()-1; i>=0; i--) {
			reverse += a.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reverse)) {
			System.err.println("it ia a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

}
