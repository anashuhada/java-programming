package day15;

// Method Overriding: same method declaration (data type, name, parameters), different implementation 
	
// This is hierarchy inheritance
class Bank {
	double roi() {
		return 0;
	}
}
	
class ICICI extends Bank {
	//only change the implementation
	double roi() {
		return 10.5;
	}
}
	
class SBI extends Bank {
	double roi() {
		return 11.5;
	}
}

public class OverridingDemo {
	
	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		double icRoi = ic.roi();
		System.out.println(icRoi);
		
		SBI sb = new SBI();
		double sbRoi = sb.roi();
		System.out.println(sbRoi);
	}

}
