package day4;

public class LargestOf2Numbers {

	public static void main(String[] args) {
		
		// method #1
		int a = 200, b = 500;
		
		if(a > b) {
			System.out.println("a is the largest number");
		}
		
		else if(b > a) {
			System.out.println("b is the largest number");
		}
		
		else {
			System.out.println("Invalid number");
		}
		
		// method #2
		int a1 = 200, b1 = 150;
		int res = (a1 > b1) ?  a1 : b1;
		System.out.println(res);
	}

}
