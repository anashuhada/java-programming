package day18;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		
		// Example 1
		/*System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(100/num); // ArithmeticException*/ 
		
		// Example 2
		/*int a[] = new int[5];
		
		System.out.println("Enter an index position (0-4): ");
		int position = sc.nextInt();
		
		System.out.println("Enter a value: ");
		int value = sc.nextInt();
		
		a[position] = value;
		
		System.out.println(a[position]); // ArrayIndexOutOfBoundsException*/
		
		// Example 3
		/*String s = "welcome";
		int num = Integer.parseInt(s);
		System.out.println(num); // NumberFormatException*/
		
		// Example 4
		String s = null; // unknown value
		System.out.println(s.length()); // NullPointerException
		
		System.out.println("Program is completed...");
		
		System.out.println("Program is exited");

	}

}
