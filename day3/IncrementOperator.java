package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called as increment operator
		// case #1
		/*int a = 10; 
		System.out.println(a);
		
		// normal expression
		// a = a + 1;
		//System.out.println(a);
		
		a++;
		System.out.println(a);*/
		
		// case #2: post increment --> post first, increment later
		/*int a = 10;
		int res = a++; // a value assigns to res which is 10
		System.out.println(res); // 10
		System.out.println(a); // 11*/
		
		// case #3: pre increment --> increment first, increment later
		int a = 10;
		int res = ++a; // increment --> assignment
		System.out.println(res); // 11
		System.out.println(a); // 11
	}

}
