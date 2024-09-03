package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		/*initialization
		while(condition) {
			statements;
			increment/decrement;
		}*/
		
		// example #1: print 1...10
		
		int i = 1; // initialization
		
		while(i <= 10) // condition
		{
			System.out.println(i); // statement
			i++; // increment
		}
		
		System.out.println();
		
		// example #2: print Hello World! 10x
		
		int message = 1; // initialization
				
		while(message <= 10) // condition
		{
		System.out.println("Hello World!"); // statement
		message++; // increment
		}
		
		System.out.println();
		
		// example #3: print even numbers 1...10
		// approach 1
		int even1 = 2;
		
		while(even1 <= 10) // condition
		{
		System.out.println(even1); // statement
		even1+=2; // increment
		}
		
		System.out.println();
		
		// approach 2
		int even2 = 2;
		
		while(even2 <= 10) // condition
		{
		if(even2%2 == 0) { 	
			System.out.println(even2); // statement
		}
		even2+=2; // increment
		}
		
		System.out.println();
		
		// example #4: 1...10
		
		int init = 1;
		
		while(init <= 10) {
			if(init%2 == 0) {
				System.out.println(init + " even number");
			}
			
			else {
				System.out.println(init + " odd number");
			}
			
			init++;
		}
		
		System.out.println();
		
		// example #5: print 10...1
		int dec = 10; // initialization
		
		// these conditions accepted
		// (i > 0)
		// (i >= 1)
		
		while(dec > 0) // condition
		{
			System.out.println(dec); // statement
			dec--; // increment
		}
		
	}

}
