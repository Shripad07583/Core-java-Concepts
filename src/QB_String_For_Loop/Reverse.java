package QB_String_For_Loop;

public class Reverse {
	
	public static void main(String[] args) {
		
		String a = "Shripad";
		String b = "";
		char ch;
		
		for(int i = 0; i<a.length(); i++) {
			
			ch = a.charAt(i);
			
			b = ch + b;
		}
		System.out.println(b);
	}

}
