package HasARealationship;

public class Student {
	
	private int id;
	
	private String name;
	
	private String city;
	
	private PersonalDetails details;
	
	private Degree details2;
	
	
	
	
	public Degree getDetails2() {
		return details2;
	}


	public void setDetails2(Degree details2) {
		this.details2 = details2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PersonalDetails getDetails() {
		return details;
	}

	public void setDetails(PersonalDetails details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", details=" + details + ", details2="
				+ details2 + "]";
	}

	
	

}
