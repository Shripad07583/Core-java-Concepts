package HasARelationship3;

public class Vehical {
	
	private String vehicalName;
	
	private String vehicalType;
	
	private Registration registrationDetails;

	public String getVehicalName() {
		return vehicalName;
	}

	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public Registration getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(Registration registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	@Override
	public String toString() {
		return "Vehical [vehicalName=" + vehicalName + ", vehicalType=" + vehicalType + ", registrationDetails="
				+ registrationDetails + "]";
	}

}
