package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		int id = sc.nextInt();
		System.out.println("Enter your First Name : ");
		String fname = sc.next();
		System.out.println("Enter your Last Name : ");
		String lname = sc.next();
		System.out.println("Enter your Phone Number : ");
		long phonenumber = sc.nextLong();
		System.out.println("Enter your City : ");
		String city = sc.next();
		System.out.println("Enter serial number : ");

		int srno = sc.nextInt();
		
		String studentDetails = (srno + " : " + id + " : " + fname + " : " + lname + " : " + phonenumber + " : " + city);
		
		System.out.println(studentDetails);
		
		String directoryPath = "C:\\Users\\boral\\OneDrive\\Desktop\\File-Handling\\Student-Details";
		
		String filename = "studentdetails.txt";
		
		File file = new File(directoryPath + "\\" + filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Existes");
			}
			
			FileWriter writer = new FileWriter(file, true);
			writer.write(studentDetails + System.lineSeparator());
			writer.close();
			System.out.println("Student Details : " + studentDetails);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			sc.close();
		}
		
	}

}
