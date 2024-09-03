package day5;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int input = 1234;
		int output = 0;
		
		while(input > 0) {
			int number = input % 10; // extract last digit
			output = output * 10 + number;
			input = input / 10; // remove last digit
		}

		System.out.println(output);
	}

}
