package packageSingleton;

public class User {
	
	
	
	public static void main(String[] args) {
		
		Aadhaar ar = Aadhaar.createObj(506312101334l);   // calling static function for object creation
		
		System.out.println(ar.ano);
	}
	
	

}
