package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		
	System.out.println("Program is started...");
		
	String s = "welcome";
		
	// Case 1: Exception occurred, catch block handled -> finally block will execute
	/*try {
		System.out.println(s.length()); // NullPointerException
	}
	catch(NullPointerException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getClass().getName());
	}
	finally {
		System.out.println("You entered into finally block...");
	}
		
	System.out.println("Program finished...");*/
	
	// Case 2: Exception occurred, catch block NOT handled -> finally block will execute
	try {
		System.out.println(s.length()); // NullPointerException
	}
	catch(NullPointerException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getClass().getName());
	}
	finally {
		System.out.println("You entered into finally block...");
	}
			
	System.out.println("Program finished...");

	}

}
