package day16;

// Multiple Inheritance: multiple parents, one child
// Multiple Inheritance -> public class Class1 implements Interface1, Interface2
// Hybrid Inheritance: hierarchy + multiple inheritance
public class Class1 extends Class2 implements Interface1, Interface2 {

	public void method1() {
		System.out.println(x);
	}
	
	public void method2() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		// access the methods through object
		Class1 cObj = new Class1();
		cObj.method1();
		cObj.method2();
		cObj.method3();
	}

}
