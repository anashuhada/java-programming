package day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {100,600,200,400,500}; // unsorted order
		
		System.out.println("Before sorting...");
		
		/*for(int x : a) {
			System.out.println(x);
		}*/
		
		System.out.println(Arrays.toString(a)); // print in array element

		Arrays.sort(a); // sort elements in array
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));
	}

}
