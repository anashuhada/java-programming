package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// 1) Declare an array
		// Approach #1: fixed/static way - if know how much the data and won't be added more data
		int a[] = new int[5]; // create 5 rows/locations
		
		// 2) Add values into an array
		// Assign data
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		// Approach #2: dynamic way - if don't know how much data to be stored
		int b[] = {100, 200, 300, 400, 500, 600};
		
		// 3) Find the length of an array
		System.out.println("Length of an array: " + b.length);
		
		// 4) Read a single value from an array
		System.out.println(a[2]); // 4 is an index
		
		// 5) Read multiple values from an array
		// Normal loop
		// i <= 4, i < 5, i <= a.length-1, a.length
		for(int i = 1; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// Enhanced for loop / for each loop
		// b is an array
		// b array will be stored in x
		// exit loop when all the values in the array executed
		for(int x : b) {
			System.out.println(x); // 100, 200, 300...
		}
		
	}

}
