
public class TestBloodType {

	public static void main(String[] args) {
		BloodType junior = new BloodType("A", '+');
		BloodType ashley = new BloodType();
		BloodType keith = new BloodType();
		
	
	
		junior.setBloodType("budweiser");
		junior.setRhFactor('+');
		
		System.out.println("Junior's blood type is " 
		+ junior.getBloodType() + junior.getRhFactor());
		
		System.out.println("Ashley's blood type is "
		+ ashley.getBloodType() + ashley.getRhFactor());
		
		System.out.println("Keith's blood type is "
		+ keith.getBloodType() + keith.getRhFactor());
		
	}
		
}

