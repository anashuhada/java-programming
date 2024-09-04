package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Example #1
		/*System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of two numbers: " + (num1 + num2));*/
		
		/*System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Name entered: " + name);
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Age entered: " + age);*/
		
		System.out.println("Enter unknown value: ");
		Object value = sc.next();
		System.out.println("Value entered: " + value);
		
	}

}
