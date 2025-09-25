package HasARelationship2;

public class Experience {
	
	private String xcompanyname;
	
	private String domain;
	
	private float salary;
	
	private int experienceYear;
	
	private String education;

	public String getXcompanyname() {
		return xcompanyname;
	}

	public void setXcompanyname(String xcompanyname) {
		this.xcompanyname = xcompanyname;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Experience [xcompanyname=" + xcompanyname + ", domain=" + domain + ", salary=" + salary
				+ ", experienceYear=" + experienceYear + ", education=" + education + "]";
	}
	
	

}
