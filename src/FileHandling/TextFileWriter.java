package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {
	
	public static void main(String[] args) {
		
		//homework
		//create an entity class = id, fname, lname, phonenumber, city
		//take input for this values using scanner
		//store this date in text file name as = studentdetails.txt
		//format should be = id : fname : lname : phonenumber : city
		//eg = 1 : abc : xyz : 789456 : pune
		//every student should be on new line
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		String name = sc.next();
		
		System.out.println("Enter your Year of Birth : ");
		
		int year = sc.nextInt();
		
		String username = ("Username : " + name+year);
		System.out.println(username);
		
		
		String directoryPath = "C:\\Users\\boral\\OneDrive\\Desktop\\File-Handling";
		
		String filename = "username.txt";
		
		File file = new File(directoryPath + "\\"+ filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Existes");
			}
			
			FileWriter writer = new FileWriter(file, true);
			writer.write(username + System.lineSeparator());
			writer.close();
			System.out.println("Username written in file : " + username);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			sc.close();
		}
		
		
	}

}
