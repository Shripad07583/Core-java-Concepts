package HasARealationship;

public class Degree {
	
	private int RollNumber;
	
	private double GPA;
	
	private String Branch;

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}


	public double getGPA() {
		return GPA;
	}

	public void setGPA(double d) {
		GPA = d;
	}

	public String getSubject() {
		return Branch;
	}

	public void setSubject(String subject) {
		this.Branch = subject;
	}
	
	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	@Override
	public String toString() {
		return "Degree [RollNumber=" + RollNumber + ", GPA=" + GPA + ", Branch=" + Branch + "]";
	}
	
	


}
