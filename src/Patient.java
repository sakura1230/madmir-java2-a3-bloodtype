
public class Patient {
	private int patientIdNumber;
	private int patientAge;
	private BloodType patientBloodData;
	
	//Overloaded constructors
	public Patient(int id, int age,BloodType bloodData) {
		this.patientIdNumber = id;
		this.patientAge = age;
		this.patientBloodData = bloodData;
	}
	//Default constructor
	public Patient() {
		this(0,0,new BloodType());
	}
	
	//Assessor Methods
	public int getPatientIdNumber() {
		return patientIdNumber;
	}
	
	public int getPatientAge() {
		return patientAge;
	}	
	public String getBloodType() {
		return patientBloodData.getBloodType() + patientBloodData.getRhFactor();
	}	

	//Mutator methods
	public void setPatientIdNumber(int newId) {
		patientIdNumber = newId;
	}
	
	public void setPatientAge(int newAge) {
		patientAge = newAge;
	}
	
	public void setPatientBloodType(BloodType newBloodType) {
		patientBloodData = newBloodType;
	}
}
