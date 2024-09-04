package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		
		// int num = 20; // hard-coded value
		
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("Enter a number: ");
		
		// integer
		// int num = sc.nextInt(); // will take the value from the console/keyboard
		// System.out.println(num);
		
		// double
		// double num = sc.nextDouble();
		// System.out.println(num);
		
		// string
		System.out.println("Enter your city: ");
		String city = sc.next();
		System.out.println("Your entered city: " + city);
		
	}

}
