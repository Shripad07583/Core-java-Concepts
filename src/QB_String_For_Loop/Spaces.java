package QB_String_For_Loop;

public class Spaces {
	
	public static void main(String[] args) {
		
		String a = "Shripad    ";
		
		
		int count = 0 ;
		
		for(int i = 0; i<a.length(); i++) {
			
			if(a.charAt(i)==' ') {
				count++;
			}
			
			
		}
		System.out.println("Total Spaces in String : " + count);
	}

}
