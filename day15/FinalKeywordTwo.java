package day15;

final class Test1 {
	final void method() {
		System.out.println("This is method from Test1...");
	}
}

// cannot extend once we put final keyword either in class/method
//class Test2 extends Test1 {
	// incorrect, because method is final method
	/*void method() {
		System.out.println("This is method from Test2...");
	}
}*/

public class FinalKeywordTwo {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.method();
		
		/*Test2 t2 = new Test2();
		t2.method();*/
		
	}

}
