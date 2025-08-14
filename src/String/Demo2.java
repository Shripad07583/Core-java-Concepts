package String;

public class Demo2 {
	public static void main(String[] args) {
		//using literals
		//SCP : if value is same if wont repeat
		
		String s = "Shripad";
		String s1 = "Shripad";
		String s2 = "Irise";
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		
		//using new keywords
		//Heap memory 
		
		String a = "abc";
		String a1 = "ABC";
		System.out.println(a.equals(a1));
		System.out.println(a==a1);
		
		
	}

}
