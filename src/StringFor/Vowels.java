package StringFor;

public class Vowels {
	
	public static void main(String[] args) {
		
		String day = "Monday";
		
		
		for(int i = 0; i<day.length(); i++) {
			
			if(day.charAt(i) !='a' && day.charAt(i) !='o') {
				System.out.println(day.charAt(i));
			}
	}
		
	}

}
