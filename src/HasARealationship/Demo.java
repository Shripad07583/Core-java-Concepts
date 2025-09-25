package HasARealationship;

public class Demo {
	
	public static void main(String[] args) {
		
		//1. Student has a degree
		//2. Employee has a experience
		//3. Student has a vehical(name)(type) and vehical has a registration details(vehical no, year, manufacturing)
		
		
		
		Student s = new Student();
		s.setId(101);
		s.setName("Shripad");
		s.setCity("Pune");
		
		
		PersonalDetails p = new PersonalDetails();
		p.setFatherName("Rajeshwar");
		p.setMotherName("Sandhya");
		s.setDetails(p);
		
		
		Degree d = new Degree();
		d.setRollNumber(519);
		d.setGPA(8.93);
		d.setBranch("Computer Science");
		s.setDetails2(d);
		System.out.println(s.toString());
	
		
		
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getCity());
//		System.out.println(s.getDetails().getFatherName());
//		System.out.println(s.getDetails().getMotherName());
	}

}
