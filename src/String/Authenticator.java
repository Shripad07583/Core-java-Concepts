package String;

import java.util.Scanner;

public class Authenticator {
	public static void main(String[] args) {
		
		String username = "Shripad";
		String password = "Annemarie2002";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String a = sc.next();
		System.out.println("Enter Password : ");
		String b = sc.next();
		
		if(a.contains(username) && b.contains(password)) {
			System.out.println("login succesfully");
		}
		else if(!a.equals(username)) {
			System.out.println("Invalid Username");
		}
		else if(!b.equals(password)) {
			System.out.println("Invalid Password");
		}
	}

}
