package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		// arithmetic operators + - * / %
		int a = 20, b = 10;
		int result = a + b;
		System.out.println("Sum of a and b is: " + result);
		System.out.println("Sum of a and b is: " + (a+b));
		System.out.println("Diff of a and b is: " + (a-b));
		System.out.println("Mul of a and b is: " + (a*b));
		System.out.println("Div of a and b is: " + (a/b));
		System.out.println("Modulo division (remainder) of a and b is: " + (a%b));
		
		// relational/comparison operators > >= < <= != ==
		// returns boolean value --> true or false
		// only can use two values --> a and b
		
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // two conditions
		System.out.println(a <= b); // false
		
		b = 20;
		System.out.println(a <= b); // true
		System.out.println(a <= b); // true
		System.out.println(a != b); // false
		System.out.println(a == b); // true
		
		boolean res = a > b; // boolean data type
		System.out.println(res);
		
		// logical operators && || !
		// returns boolean value --> true or false
		// works between two boolean values
		boolean x = true;
		boolean y = false;
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		System.out.println(!y); // true
		
		// comparison
		boolean b1 = 10 > 20; // valid
		System.out.println(b1); // false
		
		boolean b2 = 20 > 10;
		System.out.println(b2); // true
		
		System.out.println(b1 && b2); // false
		System.out.println(b1 || b2); // true
		
		System.out.println((10 < 20) && (20 > 10)); // true
	}

}
