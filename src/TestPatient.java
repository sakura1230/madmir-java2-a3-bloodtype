
public class TestPatient {

	public static void main(String[] args) {
		BloodType johnsBloodType = new BloodType("B",'-');
		Patient johnDoe = new Patient(99076, 35, johnsBloodType);
		Patient janeSmith = new Patient();
		Patient oprahWinphrey = new Patient();
		
		BloodType janesBloodType = new BloodType("AB", '+');
		janeSmith.setPatientAge(60);
		janeSmith.setPatientIdNumber(89033);		
		janeSmith.setPatientBloodType(janesBloodType);
		
		
		System.out.println("John Doe's ID number is " 
		+ johnDoe.getPatientIdNumber());
		
		System.out.println("Jane Smith's age is "
		+ janeSmith.getPatientAge());
		
		System.out.println("Oprah Winphrey's blood type is "
		+ oprahWinphrey.getBloodType());
	}

}
