package day13;

public class StaticDemo {

	static int a = 10; // static variable
	int b = 20; // non-static variable
	
	// static method
	static void methodOne() {
		System.out.println("This is methodOne static method...");
	}
	
	// non-static method
	void methodTwo() {
		System.out.println("This is methodTwo non-static method...");
	}
	
	// non-static method
	// non-static methods can access everything directly
		void methodThree() {
			System.out.println(a);
			System.out.println(b);
			methodOne();
			methodTwo();
		}
		
	
	public static void main(String[] args) {
		
		// static methods can access static stuff directly without creating object
		// System.out.println(a);
		// methodOne();
		
		// cannot access non-static variable and method
		/*System.out.println(b);
		methodTwo();*/
		
		// static methods can access non-static stuff through object
		// StaticDemo sd = new StaticDemo();
		// System.out.println(sd.b);
		// sd.methodTwo();
		
		// non-static method needs an object to call the methods
		// sd.methodThree();
	}

}
