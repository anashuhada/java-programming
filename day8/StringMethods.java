package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		// String s = new String("Welcome");
		
		// System.out.println(s);
		
		// length() - returns length of a string (number of characters)
		int l = s.length();
		System.out.println(l);
		System.out.println("Welcome".length());

		// concat() - joining strings
		String s1 = "Welcome";
		String s2 = "to Java";
		String s3 = "Automation";
		System.out.println(s1 + " " + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1 + " " + s2 + " " + s3);
		System.out.println(s1.concat(s2).concat(s3)); // multiple strings
		System.out.println(s1.concat(s2+s3));
		System.out.println("Welcome" + "to Java");
		System.out.println("Welcome".concat("to Java"));
		
		// trim() - remove spaces right and left side
		s = "   welcome   ";
		System.out.println(s); // print string along with spaces
		System.out.println("Before trimming " + s.length());
		System.out.println(s.trim());
		System.out.println("After trimming " + s.trim().length());
		
		// charAt() - returns a character from a string based on index
		// index starts from 0
		s = "Welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		// contains() - returns true or false
		// checks string is part of main string or not
		System.out.println(s.contains("Wel")); // true
		System.out.println(s.contains("come")); // true
		System.out.println(s.contains("wel")); // false
		System.out.println(s.contains("COME")); // false
		System.out.println(s.contains("Welme")); // false
		
		// equals() - case-sensitive, equalsIgnoreCase() - compare strings
		s1 = "Welcome";
		s2 = "Welcome";
		
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals("Welcome")); // true
		System.out.println(s1.equalsIgnoreCase("welcome")); // true
		
		// replace() - replace single/multiple (sequence) of characters in a string
		s = "Welcome to Selenium Java Selenium Python Selenium C#";
		System.out.println(s.replace('e', 'A'));
		System.out.println(s.replace("Selenium", "Appium"));
		
		String a = "abcaacccb";
		System.out.println(a.replace('a', 'Z').replace('c', 'S'));
		
		// substring() - extract substring from the main string
		// substring(startIndex, startIndex+1)
		// 01234567 - startIndex
		// Selenium
		// 12345678 - endIndex
		s = "Selenium";
		System.out.println(s.substring(1, 5)); // elen
		System.out.println(s.substring(0, 3)); // Sel
		
		s = "Welcome";
		// toUpperCase
		System.out.println(s.toUpperCase());
		// toLowerCase
		System.out.println(s.toLowerCase());
		
		// split() - split the into multiple parts based on the delimiter
		// returns array
		s = "abc@gmail.com";
		String dlmtr[] = s.split("@");
		System.out.println(dlmtr[0]); // abc
		System.out.println(dlmtr[1]); // gmail.com
		System.out.println(Arrays.toString(dlmtr));
		
		// Example #1
		String amount = "$15,20,55"; 
		System.out.println(amount.replace("$", "").replace(",", "")); // 152055
		
		// Example #2
		s = "abc,123@xyz";
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); // [123, xyz]
		
		System.out.println(arr1[0]); // abc
		System.out.println(arr2[0]); // 123
		System.out.println(arr2[1]); // xyz
		
		// Example #3
		s = "abc 123";
		String ar[] = s.split(" ");
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		// cannot use these as delimiters * % ^ & ( ) 
		
		// Example #4
		String name = "John Kenedy";
		System.out.println(name.contains("john")); // false
		System.out.println(name.replace('J', 'j').contains("john")); // true
		System.out.println(name.toLowerCase().contains("john")); // true
  	}

}
