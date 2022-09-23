package packageSingleton;

public class Aadhaar {
	
	private int adhaarNo;
	
	private Aadhaar ar;
	
	private Aadhaar(int adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	
	public Aadhaar createObj(int no) {
		if(ar==null) {
			ar = new Aadhaar(no);
		}
		else {
			System.out.println("Aadhaar already created");
			System.out.println("Your Aadhaar No: "+this.adhaarNo);
		}
		return ar;
	}

}
