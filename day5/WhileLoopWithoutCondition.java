package day5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(true) {
			System.out.println("Hello " + i);
			i++; // execute infinitely
			
			// filter to exit the loop
			if(i == 10) {
				break;
			}
		}

	}

}
