package day5;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
		
		int number = 10011399; // input
		int count = 0;
		
		while(number != 0) {
			number = number / 10; // remove the last digit
			count++; // increment for each digit
		}
		System.out.println(count);
	}

}
