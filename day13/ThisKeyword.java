package day13;

public class ThisKeyword {
	
	int x, y; // class variables / instance variables
	
	// if create in method - local variables
	// if create outside class - global variables; not supported in Java	
	
	// constructor
//	ThisKeyword(int x, int y) {
//		// local variables only accessible in the methods
//		/*x = x; // logical error
//		y = y;*/
//		
//		this.x = x; // use this.
//		this.y = y;
//		
//	}
	
	void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		// ThisKeyword tk = new ThisKeyword(100, 200); // this object got error when deleting the constructor
		ThisKeyword tk = new ThisKeyword();
		tk.setData(100, 500);
		tk.display();
	}

}
