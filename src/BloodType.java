
public class BloodType {
	private String bloodType;
	private char rhFactor;

	//Constructors
	public BloodType(String newBloodType, char newRhFactor) {	
		bloodType = newBloodType;
		rhFactor = newRhFactor;
	}

	public BloodType()  {
		this("0", '+');
	}
	
	//Assessor methods
	public String getBloodType() {
		return bloodType;
	}	

	public char getRhFactor() {
		return rhFactor;
	}

	//Mutator methods
	public void setBloodType(String blood) {
	bloodType = blood;
	}

	public void  setRhFactor(char rh) {
	rhFactor = rh;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
