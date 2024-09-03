package day5;

public class CountNumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {
		
		int number = 1241189; // input
		int even = 0;
		int odd = 0;
		
		while(number != 0) {
			int digit = number % 10; // extract last digit
			
			if(digit % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			
			number = number / 10; // remove last digit
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}

}
