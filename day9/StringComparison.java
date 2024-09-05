package day9;

public class StringComparison {

	public static void main(String[] args) {
		
		// Case #1
		/*String s1 = "welcome"; 
		String s2 = "welcome";   
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true*/
		
		// Case #2
		/*String s1 = new String("welcome"); // new --> create a new object --> s1
		String s2 = new String("welcome"); // new --> create a new object --> s2
										   // so they are different objects, not values
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s1 == s2); // false, == used to compare the object
		System.out.println(s1.equals(s2)); // true, equals used to compare the values of object*/
		
		// Case #3
		/*String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true*/
		
		// Case #4
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2;
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true, both are same values
		System.out.println(s2 == s3); // true, refer to the same object
		System.out.println(s2.equals(s3)); // true, because both have same values
		System.out.println(s1 == s3); // false, because from different objects
	}

}
