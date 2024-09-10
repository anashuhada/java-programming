package day14;

// single inheritance
// parent class
class A {
	int a;
	void display() {
		System.out.println(a);
	}
}

// child class
class B extends A {
	int b;
	void show() {
		System.out.println(b);
	}
}

// multi level inheritance
class C extends B {
	int c;
	void print() {
		System.out.println(c);
	}
}

// only one class can have public class
public class InheritanceTypes {

	public static void main(String[] args) {
		
		/*B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.display();
		obj.show();*/
		
		C obj = new C();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		
		obj.display();
		obj.show();
		obj.print();

	}

}
