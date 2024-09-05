package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		// String is immutable
		// StringBuffer and StringBuilder are mutable
		
		// String
		String s = "welcome";
		s.concat("to Java");
		System.out.println(s); // immutable, cannot change original value

		// StringBuffer
		StringBuffer sBuffer = new StringBuffer("welcome");
		sBuffer.append(" to Java");
		System.out.println(sBuffer); // mutable, can change original value
		
		// StringBuffer
		StringBuilder sBuilder = new StringBuilder("welcome");
		sBuilder.append(" to Java");
		System.out.println(sBuilder); // mutable, can change original value
	}

}
