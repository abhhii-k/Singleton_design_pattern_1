package packageSingleton;

public class Aadhaar {
	
	private static long adhaarNo;
	
	public final long ano;
	
	private static Aadhaar ar;
	
	private Aadhaar(long aadhaarNo) {
		Aadhaar.adhaarNo = aadhaarNo;
		ano = Aadhaar.adhaarNo;
		System.out.println("Adhaarno created");
	}
	
	public static Aadhaar createObj(long no) {
		if(ar==null) {
			ar = new Aadhaar(no);
		}
		else {
			System.out.println("Aadhaar already created");
			System.out.println("Your Aadhaar No: "+Aadhaar.adhaarNo);
		}
		return ar;
	}

}
