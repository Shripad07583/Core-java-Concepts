package HasARelationship3;

public class Registration {
	
	private int vehicalNumber;
	
	private int year;
	
	private String Manufacturing;

	public int getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(int vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getManufacturing() {
		return Manufacturing;
	}

	public void setManufacturing(String manufacturing) {
		Manufacturing = manufacturing;
	}

	@Override
	public String toString() {
		return "Registration [vehicalNumber=" + vehicalNumber + ", year=" + year + ", Manufacturing=" + Manufacturing
				+ "]";
	}
	
	

}
