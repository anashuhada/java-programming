package day15;

class Test {
	final int x = 100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t = new Test();
		/// t.x = 200; // incorrect because x is the final value - constant value
		System.out.println(t.x);

	}

}
