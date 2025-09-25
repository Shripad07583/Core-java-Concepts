package FileHandlingTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Test {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		System.out.println("**Welcome to Student Portal**");
		System.out.println("Please Enter Number of Student you want to add : ");
		int noOfStudent = sc.nextInt();
		int count = 1;
		
		while(count <= noOfStudent) {
			Test t = new Test();
			
			Student student = t.getStudentObjectFromUser();
			try {
				String msg = t.updateFile(student);
				System.out.println(msg);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			count++;
		}
		System.out.println("Total Student Added in File : " + (count-1));
		sc.close();
		
	}
	
	private String updateFile(Student student) throws IOException {
		
		String directoryPath = "C:\\Users\\boral\\OneDrive\\Desktop\\File-Handling\\Student-Details\\Student-Task";
		String filename = "StudentData.txt";
		File file = new File(directoryPath + "\\" + filename);
		if(file.createNewFile()) {
			System.out.println("File Created with name : " + filename);
		}
		else {
			System.out.println("File already exists : Updating existing File");
			
		}
		
		FileWriter writer = new FileWriter(file, true);
		
		writer.write(student.getId() + ":");
		writer.write(student.getFirstName() + ":");
		writer.write(student.getLastName() + ":");
		
		BigInteger phonenumber = BigInteger.valueOf(student.getPhonenumber());
		writer.write(phonenumber + ":");
		
		writer.write(student.getCity() + ";" + System.lineSeparator());
		
		String msg = "Student : " + student.getFirstName() + " : updated in file : " + filename;
		
		writer.close();
		
		return msg;
		
	
	}
	
	private Student getStudentObjectFromUser() {
		System.out.println("Please provide Following Details");
		
		System.out.println("Please Enter ID : ");
		int id = sc.nextInt();
		
		System.out.println("Please Enter First Name : ");
		String firstName = sc.next();
		
		System.out.println("Please Enter Last Name : ");
		String lastName = sc.next();
		
		System.out.println("Please Enter Phone Number : ");
		long phonenumber = sc.nextLong();
		
		System.out.println("Please Enter City : ");
		String city = sc.next();
		
		Student student = constructStudentObject(id, firstName, lastName, phonenumber, city);
		
		return student;
		
	}
	
	private Student constructStudentObject(int id, String firstName, String lastName, long phonenumber, String city) {
		
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setPhonenumber(phonenumber);
		student.setCity(city);
		
		return student;
	}

}
