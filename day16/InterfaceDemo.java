package day16;
// Interface: abstract method, default method, static method
interface Shape {
	// final and static - default keywords
	int length = 10; // final and static
	int width = 20; // final and static
	
	void circle(); // abstract method - public
	
	// only declaration of method allowed
	default void square() {
		System.out.println("This is a square - default method...");
	}
	
	static void rectangle() {
		System.out.println("This is a rectangle - static method...");
	}
	
}


public class InterfaceDemo implements Shape {

	// implementation of interface
	// when trying to implement the interface must put public as access modifier
	public void circle() {
		System.out.println("This is a circle - abstract method...");
	}
	
	void triangle() {
		System.out.println("This is a triangle...");
	}
	
	// this variable belongs to InterfaceDemo class
	int x = 100, y = 200;
	
	public static void main(String[] args) {
		
		// Scenario 1
		InterfaceDemo id = new InterfaceDemo();
		id.circle(); // abstract method
		id.square(); // default method
		
		// static method
		Shape.rectangle(); // static method can directly access from interface
		System.out.println(Shape.length * Shape.width);	// accessing static variable directly	
		id.triangle();
		System.out.println(id.x + id.y);
		// Scenario 2
		// Shape sh = new Shape(); // cannot instantiate
		/*Shape sh = new InterfaceDemo(); // use class name instead interface name
		      							// cannot use interface name to create an object
		sh.circle(); // abstract
		sh.square(); // default
		Shape.rectangle(); // static method can directly access from interface*/
		// sh.triangle(); we cannot access because it purely from InterfaceDemo class, it's not belongs to interface Shape
		// System.out.println(sh.x + sh.y); // cannot access
	}

}
