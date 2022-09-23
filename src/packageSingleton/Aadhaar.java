package packageSingleton;

public class Aadhaar {
	
	private static long adhaarNo;
	
	public final long ano;
	
	private static Aadhaar ar;				//private static non-primitive Aadhaar datatype
	
	private Aadhaar(long aadhaarNo) {                  //Private constructor
		Aadhaar.adhaarNo = aadhaarNo;
		ano = Aadhaar.adhaarNo;
		System.out.println("Adhaarno created");
	}
	
	public static Aadhaar createObj(long no) {      //static Function for object creation
		if(ar==null) {
			ar = new Aadhaar(no);
		}
		else {
			System.out.println("Aadhaar already created");
			System.out.println("Your Aadhaar No: "+Aadhaar.adhaarNo);
		}
		return ar;                          //returning Object reference
	}

}
