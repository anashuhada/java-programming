package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter a value for position " + i + ": ");
			a[i] = sc.nextInt(); // store in first position and so on...
		}
		
		System.out.println("Printing array elements...");
		System.out.println(Arrays.toString(a));

	}

}
