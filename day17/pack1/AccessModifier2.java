package day17.pack1;

public class AccessModifier2 {

	public static void main(String[] args) {
		
		// access from different class
		AccessModifier1 am = new AccessModifier1();
		System.out.println(am.x);
		am.method1(); // when add private access modifier - error; cannot access the method
	}

}
