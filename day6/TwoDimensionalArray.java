package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// 1) Declare an array
		// Approach #1: static way
		// int [][]a OR int []a[]
 		int a[][] = new int[3][2]; // 3 rows, 2 columns
		
		// 2) Add values into an array
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		// Approach #2
		int b[][] = {{100, 200},
					 {300, 400},
					 {500, 600}
					};
		
		// 3) Find the length of an array, use index of row
		System.out.println("Length of rows: " + b.length);
		System.out.println("Length of columns: " + b[0].length);
		
		// 4) Read a single value from an array, [row][column]
		System.out.println(b[2][1]);
		
		// 5) Read multiple values from an array
		// Normal for loop
		// row
		for(int r = 0; r <= 2; r++) { // 2
			// column
			for(int c = 0; c <= 1; c++) { // 0 1
				System.out.print(b[r][c] + " "); // 500 600 
			}
			
			System.out.println();
		}
		
		// other way to write
		/*for(int r = 0; r <= b.length-1; r++) { // 2
			// column
			// inner for loop repeats for 2 times
			for(int c = 0; c <= b[r].length-1; c++) { // 0 1
				System.out.print(b[r][c] + " "); // 500 600 
			}
			
			System.out.println();
		}*/
		
		// for each loop
		// outer loop
		// b presents entire array values
		// 100 200 will be stored in arr[]
		for(int arr[] : b) {
			// inner loop
			// arr contains 100 200
			// 100 will be stored to x --> print 100
			// then 200 will be stored to x --> print 200
			for(int x : arr) { // stored in single dimensional
				System.out.print(x + " "); // 100 200
			}
			
			System.out.println();
		}
	}

}
