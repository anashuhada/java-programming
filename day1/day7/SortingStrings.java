package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		// using char 
		char c[] = {'D', 'C', 'B', 'A'};
		
		System.out.println("Before sorting... " + Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("After sorting... " + Arrays.toString(c));
		
		System.out.println();
		
		// using string
		
		String s[] = {"Scott", "Mary", "John", "David"};
		
		System.out.println("Before sorting... " + Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting... " + Arrays.toString(s));
		
		
	}

}
