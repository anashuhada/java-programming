package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		// Approach #1: use length() and charAt()
		/*String s = "welcome";
		String rev = ""; // will store the values
		
		// s.length()-1 --> last index
		// 7-1=6, 6-1-5...
		for(int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse string is: " + rev);*/
		
		// Approach #2: without using string methods
		// Converting string to char array type
		// charArray()
		/*String s = "welcome"; // convert into character index array
		String rev = "";
		
		char a[] = s.toCharArray();	// convert String into char array
		
		for(int i = a.length-1; i >= 0; i--) {
			rev = rev + a[i];
		}
		
		System.out.println("Reverse string is: " + rev);*/
		
		// reverse() only when using StringBuffer and StringBuilder
		// Approach #3: use StringBuffer class
		StringBuffer s = new StringBuffer("welcome");
		System.out.println("Reverse StringBuffer is: " + s.reverse());
		
		// Approach #4: use StringBuilder class
		StringBuilder sb = new StringBuilder("welcome");
		System.out.println("Reverse StringBuilder is: " + sb.reverse());
	}
		
}
