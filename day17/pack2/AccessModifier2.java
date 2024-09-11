package day17.pack2;

import day17.pack1.*;

// protected must use inheritance 
/*public class AccessModifier2 extends AccessModifier1 {

	public static void main(String[] args) {
		
		// access from different class
		// AccessModifier1 am1 = new AccessModifier1();
		// System.out.println(am1.x);
		// am1.method1(); // cannot access default because only can be accessed within the same package
						  // must import the package
						   
		AccessModifier2 am2 = new AccessModifier2();
		System.out.println(am2.x);
		am2.method1();
	
	}

}*/

public class AccessModifier2 {

	public static void main(String[] args) {
		
		// access from different class
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println(am1.x);
		am1.method1(); // cannot access default because only can be accessed within the same package
	}
}
