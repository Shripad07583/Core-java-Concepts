package QB_String_For_Loop;

public class Digits {
	
	public static void main(String[] args) {
		
		String a = "shri2003";
		
		int count = 0;
		
		for(int i = 0; i<a.length(); i++) {
			
			if(a.charAt(i)>=48 && a.charAt(i)<= 57) {
				
				count++;
			}
			
		}
		System.out.println("Total number of Digits : " + count);
	}

}
