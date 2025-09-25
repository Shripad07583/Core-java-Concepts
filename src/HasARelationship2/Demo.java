package HasARelationship2;

public class Demo {
	
	public static void main(String[] args) {
		
		Empolyee e = new Empolyee();
		e.setId(101);
		e.setName("Shripad Rajeshwar Boral");
		e.setCity("Pune");
		e.setRole("Software Engineer");
		
		
		Experience a = new Experience();
		a.setXcompanyname("Capgemini");
		a.setDomain("Full-Stack Developer");
		a.setSalary(475000);
		a.setEducation("B.E Computer Science and Engineering");
		a.setExperienceYear(2);
		
		e.setExperience(a);
		
		System.out.println(e.toString());
		
		
		
		
		
	}

}
