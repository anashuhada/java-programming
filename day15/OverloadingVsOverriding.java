package day15;

class ABC {
	
	void method1(int a) {
		System.out.println(a);
	}
	
	void method2(int b) {
		System.out.println(b);
	}
}

// this class has 3 methods
class XYZ extends ABC {
	
	// create same method in class ABC - overriding counts as one, because we only overriding the method, but change the implementation
	// in overriding we only override the declaration (data type, name, parameters not changed), but has changes in the implementation
	void method1(int a) {
		System.out.println(a * a);
	}
	
	// overloading - because changing of parameters
	// in overloading only name is same but the data type, parameter names and orders are changed
	// can have same implementation or modify it
	void method2(int a, int b) {
		System.out.println(a + b);
	}
	
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ objXYZ = new XYZ();
		objXYZ.method1(10);
		objXYZ.method2(20);
		objXYZ.method2(30, 70);
		
	}

}
