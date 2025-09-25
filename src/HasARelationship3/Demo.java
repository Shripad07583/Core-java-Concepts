package HasARelationship3;

public class Demo {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(101);
		s.setName("Shripad Rajeshwar Boral");
		s.setCity("Pusad");
		
		Vehical v = new Vehical();
		v.setVehicalName("Apache RTR 160 4v");
		v.setVehicalType("Sports Bike");
		
		s.setVehical(v);
		
		Registration r = new Registration();
		r.setVehicalNumber(2625);
		r.setManufacturing("TVS-Apache");
		r.setYear(2024);
		v.setRegistrationDetails(r);
		
		System.out.println(s.toString());
		
	}

}
