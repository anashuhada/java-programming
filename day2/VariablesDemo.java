package day2;

public class VariablesDemo {

	public static void main(String[] args) {
		
		// create variables
		// int a; // declaration
		// a = 100; // assignment
		
		// single statement
		/*int a = 100; // declaration + assignment
		System.out.println(a);
		
		// change a value
		a = 200;
		System.out.println(a);*/
		
		// approach 1: if all variables belongs to different data types
		/*int a = 100;
		int b = 200;
		int c = 300;*/
		
		// approach 2: if all variables are belongs to the same data types
		/*int a, b, c;
		a = 100;
		b = 200;
		c = 300;*/
		
		// approach 3: if all variables are belongs to the same data types
		int a = 100, b = 200, c = 300;
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The value of c is: " + c);
		
		System.out.println(a + b + c);
		
		System.out.println("The value of a is: " + a + " The value of b is: " + b + " The value of c is: " + c);
		
	}

}
