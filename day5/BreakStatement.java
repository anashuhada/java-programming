package day5;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break; // exit the entire loop if condition is true
			}
			
			System.out.println(i);
		}

	}

}
