package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import FileHandlingTask.Student;


public class TextReaderTask {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\boral\\OneDrive\\Desktop\\File-Handling\\Student-Details\\Student-Task\\StudentData.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				
				Student student = new Student();
				
				System.out.println(student);
			}
			
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
