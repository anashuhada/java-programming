package day12;

public class Adder {
	
	int a = 10, b = 20;
	
	// Method 1
	void sum() {
		System.out.println(a+b);
	}
	
	// Method is duplicated
	/*int sum() {
		return a+b;
	}*/
	
	// Method 2 - number of parameters should be different 
	void sum(int x, int y) {
		System.out.println(x+y);
	}
		
	// Method 3 - data type of parameters should be different 
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	// Method 4 - order of parameters should be different 
	void sum(double x, int y) {
		System.out.println(x+y);
	}
	
	// Method 5
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
