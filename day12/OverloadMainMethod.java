package day12;

public class OverloadMainMethod {
	
	// main method can be overloaded
	void main(int x) {
		System.out.println(x);
	}
	
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public static void main(String[] args) {
		
		// access the object in this main method
		OverloadMainMethod ovm = new OverloadMainMethod();
		ovm.main(100);
		ovm.main("Hello");
		ovm.main("David and ", "Johnny");
		
	}

}
