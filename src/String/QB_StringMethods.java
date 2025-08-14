package String;

public class QB_StringMethods {
	public static void main(String[] args) {
		//length on an empty string
		String a = "";
		System.out.println(a.length());
		
		//char result
		String str = "Hello World";
		System.out.println(str.charAt(4));
		
		
		//equals differ from ==
		String s = "shripad";
		String b = "shripad";
		System.out.println(s.equals(b));
		System.out.println(s==b);
		
		
		//equlasIgnoreCase
		String e = "hello World";
		System.out.println(e.equalsIgnoreCase("Hello World"));
		
		
		
		//toUpperCase()
		String r = "java";
		System.out.println(r.toUpperCase());
		
		
		//trim()
		String t = "   Java   ";
		System.out.println(t.trim());
		
		
		
		//substring()
		String y = "HelloWorld";
		System.out.println(y.substring(5));
		
		String i = "Programming";
		System.out.println(i.substring(3,6));
		
		
		//compareTo()
		String o = "apple";
		System.out.println(o.compareTo("banana"));

		
		//prefix
		String p = "preflix";
		System.out.println(p.startsWith("pre"));
		
		
		//OpenAI index
		System.out.println("OpenAI".indexOf('A'));
		
		
		//last index
		String l = "abracadabra";
		System.out.println(l.lastIndexOf("a"));
		
		//Concat
		System.out.println("Hello".concat("World"));
		
		
		//replace
		System.out.println("abc".replace('b', 'x'));
		
		
		//contains
		String g = "lords test ground";
		System.out.println(g.contains("test"));
		
		
		//Empty
		System.out.println("".isEmpty());
		System.out.println("  ".isEmpty());
		
		
		//toLowerCase
		System.out.println("Test".toLowerCase());
		
		
		//split
		String m = "a,b,c";
		System.out.println(m.split(","));
		
		
		//equals new string
		System.out.println("Hello".equals(new String("Hello")));
		
		
		//repeat
		System.out.println("Java".repeat(3));
		
		
		
		
	}

}
