package day11;

public class Greetings {
	
	// 1) No params, no return value
	// add void if no returns value
	// add data type if returns any value
	void methodOne() {
		System.out.println("Hello..."); // this is not a value, just a statement
	}
	
	// 2) No params, returns value
	String methodTwo() {
		return "How are you?"; // this is a String data type
	}
	
	// 3) Take params, no return value
	void methodThree(String name) {
		System.out.println("Hi, " + name);
	}
	
	// 4) Take params, returns value
	String methodFour(String name) {
		return "Hi, " + name;
	}
 }
