package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		
		// Example #1: search an element in array (linear search)
		
		int a[] = {10,20,30,40,50}; // 1) create an array
		int search_element = 30; // 2) look for the which element/number
		
		boolean status = false; // default
								// false means not found, true means found
		
		// normal for loop
		/*for(int i = 0; i < a.length; i++) {
			if(a[i] == search_element) {
				System.out.println("Element found");
				status = true; // element found
				break; // no need to keep iterating once found
				// the execution will exit the loop when
				// 1) the condition/element found (because of the break)
				// 2) the iteration is completely done even the element not found
			}
			
		}
		
		if(status == false) {
			System.out.println("Element not found");
		}*/
		
		// for each loop
		for(int x : a) {
			if(x == search_element) {
				System.out.println("Element found");
				status = true; // element found
				break; // no need to keep iterating once found
				// the execution will exit the loop when
				// 1) the condition/element found (because of the break)
				// 2) the iteration is completely done even the element not found
			}
		}
		
		if(status == false) {
			System.out.println("Element not found");
		}

	}

}
