package day13;

public class StaticMain {

	public static void main(String[] args) {
		// static methods can access static stuff directly without creating object
		// System.out.println(a); // separate main method from different class got error
		// methodOne();
		
		System.out.println(StaticDemo.a); // have to specify the class name
		StaticDemo.methodOne();
				
		// cannot access non-static variable and method
		/*System.out.println(b);
		methodTwo();*/
				
		// static methods can access non-static stuff through object
		StaticDemo sd = new StaticDemo();
		// System.out.println(sd.b);
		// sd.methodTwo();
				
		// non-static method needs an object to call the methods
		// sd.methodThree();
	}

}
