package day19;

public class TypeCastingConcept {
	
	// upcasting: converting value from smaller to larger
	// int -> long
	// float -> double
			
	// downcasting: converting value from larger to smaller
	// long -> int
	// double -> float

	public static void main(String[] args) {
		
		// upcasting - automatic process from smaller -> larger
		/*int intValue = 100;
		long longValue = intValue;
		System.out.println(longValue);*/
		
		/*float floatValue = 10.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);*/
		
		// downcasting - manually process from larger -> smaller
		/*long longValue = 10000;
		// int intValue = longValue; // invalid way
		int intValue = (int)longValue;*/
		
		/*double doubleValue = 125.55;
		float floatValue = (float)doubleValue;*/
		
		// Example #1: upcasting
		/*int i = 100;
		double d = i; // double is larger than int, int cannot hold double value but double can hold int value
		System.out.println(d);*/
		
		// Example #2: downcasting
		double d = 10.5;
		int i = (int)d;
		System.out.println(i);
	}

}
