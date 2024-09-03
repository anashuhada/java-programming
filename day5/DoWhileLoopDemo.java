package day5;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		/*
		initialize;
		
		do {
			statements; // at least this statement executed once
			increment/decrement;
		}
		
		while(condition);*/
		
		// example #1: print 1...10
		int i = 1;
		do {
			System.out.println(i); // 1 2 3...10
			i++; // 2 3 4...11
		}
		while(i <= 10);
		
		int dec = 10;
		do {
			System.out.println(dec);
			dec--;
		}
		while(dec > 0);
		
	}

}
