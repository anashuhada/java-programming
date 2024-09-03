package day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		// numeric data types
		int a = 100, b = 200;
		System.out.println("The value a is: " + a);
		System.out.println("The value b is: " + b);
		System.out.println(a + b);
		System.out.println("The sum of a and b is: " + (a + b));

		byte by = 125;
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		long lg = 21213123123L; // literal is needed L/l
		System.out.println(lg);
		
		// decimal numbers
		float item_price = 15.5F; // literal is needed F/f
		System.out.println(item_price);
		
		double dbl = 1234.4343412;
		System.out.println(dbl);
		
		// single character
		char grade = 'A';
		System.out.println(grade);
		
		// multiple character
		String name = "John";
		System.out.println(name);
		
		// char ch = 'ABC'; // invalid
		// String ch = 'ABC'; // invalid
		// String ch = 'A'; // invalid
		String ch = "A"; // valid
		
		boolean bl = true; // allows only true/false
		System.out.println(bl);
		
		// boolean bl = "true";  // invalid
		// String bl = true; // invalid
		// String bl = "true"; // valid
	}

}
