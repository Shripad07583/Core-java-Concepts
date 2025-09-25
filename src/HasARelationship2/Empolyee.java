package HasARelationship2;

public class Empolyee {
	
	private int id;
	
	private String name;
	
	private String city;
	
	private String Role;
	
	private Experience experience;

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

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", city=" + city + ", Role=" + Role + ", experience="
				+ experience + "]";
	}
	
	
	

}
