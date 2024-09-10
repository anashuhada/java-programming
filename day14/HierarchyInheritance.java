package day14;

// cannot duplicate class name
class Parent {
	void display(int a) {
		System.out.println(a);
	}
}

class childOne extends Parent {
	void show(int b) {
		System.out.println(b);
	}
}

class childTwo extends Parent {
	void print(int c) {
		System.out.println(c);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
		childOne cOne = new childOne();
		cOne.display(100);
		cOne.show(200);
		
		childTwo cTwo = new childTwo();
		cTwo.display(500);
		cTwo.print(100);
	}

}
