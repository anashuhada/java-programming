package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		// String -> Int 
		// String s = "welcome"; // cannot convert to int
		/*String s = "12345";
		int sInt = Integer.parseInt(s);
		System.out.println(sInt);*/
		
		/*String s1 = "10";
		String s2 = "20";
		System.out.println(s1 + s2); // no addition operation, instead only concat

		// we have to convert from String to int to perform the addition operation
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));*/
		
		// String -> Double
		/*String s1 = "10.3";
		String s2 = "20.7";
		System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2));*/
	
		// String -> Boolean
		/*String s = "abc"; // only pass true will return true, other than that it will return false
		System.out.println(Boolean.parseBoolean(s));*/
		
		// String -> Char impossible because string contains multiple characters, while Char only single character
	
		// Primitive type int, double, boolean, char -> String (not a wrapper class)
		int a = 10;
		double d = 10.5;
		char c = 'A';
		boolean bool = true;
	
		String s = String.valueOf(a);
		System.out.println(s);
		
		s = String.valueOf(d);
		System.out.println(s);
		
		s = String.valueOf(c);
		System.out.println(s);
		
		s = String.valueOf(bool);
		System.out.println(s);
		
		
		
	
	}

}
