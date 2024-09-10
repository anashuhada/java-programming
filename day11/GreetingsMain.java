package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr = new Greetings();
		// 1) No params, no return value
		gr.methodOne();
		
		// 2) No params, returns value
		String str = gr.methodTwo(); // if method returning something
									 // we've to capture the return values in a variable
		System.out.println(str);
		
		// 3) Take params, no return value
		gr.methodThree("Johnny");
		
		// 4) Take params, returns value
		String m4 = gr.methodFour("David");
		System.out.println(m4);
		
	}

}
