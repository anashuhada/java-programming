package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		/*for(initialization; condition; increment/decrement) {
			statements;
		}
		1) check for initialization
		2) check the condition
		3) execute the statement
		4) inc/dec occurs
		5) stop when condition false
		*/
		
		// example #1: print 1...10
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// example #2: print 1...10 even numbers
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// example #3: print 1...10 even and odd numbers
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i + " even number");
			}
			else {
				System.out.println(i + " odd number");
			}
		}
		
		System.out.println();
		
		// example #4: print 10...1
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
