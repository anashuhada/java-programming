package day19;

class Parent {
	
	String name = "John";
	
	void m1() {
		System.out.println("This is m1 from Parent class...");
	}
}

class Child extends Parent {
	
	int id = 101;
	
	void m2() {
		System.out.println("This is m2 from Child class...");
	}
}

public class TypeCastingObjects1 {
	
	public static void main(String[] args) {
		
		/*Child c = new Child();
		System.out.println(c.name); // Parent 
		c.m1();
		System.out.println(c.id); // Child 
		c.m2();*/
		
		// parent larger, child smaller
		// storing the lowest object into higher variable
		/*Parent p = new Child(); // upcasting
		System.out.println(p.name); // can only access from Parent because the reference variable belongs to Parent
		p.m1();*/
		/*System.out.println(p.id); // cannot access 
		p.m2();*/
		
		// want to store larger object Parent to smaller object Child
		// downcasting
		Parent p = new Parent();
		Child c = (Child)p;
		
		// getting errors at the runtime
		System.out.println(c.name); // Parent 
		c.m1();
		System.out.println(c.id); // Child 
		c.m2();

		// if don't know what data type is returning 
		// Object x = a[2]; - use object
		// Object is the parent of the parent - can be accessed eveything
		// Parent p = new Child();
		
		// if know what data type is returning 
		// String x = a[2]; - use the data type
		// Child c = new Child();
	}	

}
