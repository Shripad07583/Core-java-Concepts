package QB_String_For_Loop;

public class Vowels {
	
	public static void main(String[] args) {
		
		String a = "Shripad";
		a = a.toLowerCase();
		
		int count = 0;
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == 'i' || a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				count++;
				
			}
			
		}
		System.out.println("The count of vowels in a String : " + count);
	}

}
