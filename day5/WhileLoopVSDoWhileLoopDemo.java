package day5;

public class WhileLoopVSDoWhileLoopDemo {

	public static void main(String[] args) {
		
		int wl = 1;
		
		// check condition first
		// if true the statement will be executed
		// if false the statement will not be executed
		while(wl <= 5) {
			System.out.println(wl + " While Loop");
			wl++;
		}
		
		System.out.println();
		
		int dwl = 10;
		
		// statement will be executed at least once
		// checking condition will do later
		do {
			System.out.println(dwl + " Do While Loop");
			dwl++;
		} while(dwl <= 5);

	}

}
