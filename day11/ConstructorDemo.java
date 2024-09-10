package day11;

public class ConstructorDemo {

	int x, y;
	
	// default constructor
	ConstructorDemo() {
		x = 100;
		y = 200;
	}
	
	// parameterized constructor
	ConstructorDemo(int a, int b) {
		x = a;
		y = b;
	}
	
	void sum() {
		System.out.print(x+y);
	}
	
	public static void main(String[] args) {
		
		// ConstructorDemo cd = new ConstructorDemo(); // if not passing params, it will execute the default constructor
		ConstructorDemo cd = new ConstructorDemo(500,180); // if passing params, it will execute the parameterized constructor
		cd.sum();
	}

}
