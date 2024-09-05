package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
	
		// only String is immutable in Java
		// if any operation/method can change --> mutable = changeable		
		int a[] = {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // mutable
		System.out.println(Arrays.toString(a));
		
		// if any operation/method cannot change --> immutable = unchangeable
		String s = new String("welcome");
		System.out.println(s);
		s.concat("to Java"); // immutable, need to create a variable
		String concatString = s.concat("to Java");
		System.out.println(s); // welcome
		System.out.println(concatString);
	}

}
