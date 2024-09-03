package day5;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		
		int input = 1234;
		int sum = 0; // initialize
		
		while(input != 0) {
			int digit = input % 10; // extract last digit
			sum += digit; // add digit to the sum
			input = input / 10; // remove last digit	
		}
		
		System.out.println("Sum: " + sum);

	}

}
