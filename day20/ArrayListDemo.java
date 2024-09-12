package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration ArrayList class
		// Heterogeneous data
		ArrayList myList = new ArrayList(); // valid declaration
		// List myList = new ArrayList(); // valid declaration
		
		// Homogeneous  data
		// ArrayList<int> myList = new ArrayList<int>(); primitive not allowed
		// ArrayList<Integer> myList = new ArrayList<Integer>(); wrapper class allowed
		// ArrayList<String> myList = new ArrayList<String>();
		// ArrayList<Employee> myList = new ArrayList<Employee>(); employee object
		
		// Adding data into ArrayList
		// add() - adding the value at the end of list order/sequence
		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add('A');
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);
		
		// Size of ArrayList
		System.out.println("Size of ArrayList: " + myList.size()); // 8
		
		// Print ArrayList
		System.out.println("Printing data from ArrayList: " + myList); // [100, 10.5, Welcome, A, true, 100, null, null]
		
		// Remove some elements from ArrayList
		myList.remove(5);
		System.out.println("After removing 5th element from ArrayList: " + myList); // [100, 10.5, Welcome, A, true, null, null]
	
		// Insert element in ArrayList - can add the value at any list position, the previous list will be changed
		myList.add(2, "Java");
		System.out.println("After insertion: " + myList); // 100, 10.5, Java, Welcome, A, true, null, null]

		// Modify element in ArrayList (modify/replace/change)
		myList.set(2, "Python");
		System.out.println("After modification: " + myList); // [100, 10.5, Python, Welcome, A, true, null, null]
	
		// Access specific element from ArrayList
		System.out.println(myList.get(3));
		
		// Reading all the elements from ArrayList
		// Normal For Loop
		// OR int i = 0; i <= myList.size()-1; i++
		/*for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}*/
		
		// For Each Loop
		// use Object since ArrayList has different types of data
		// myList is the ArrayList name declared
		// x is just a variable
		/*for(Object x : myList) {
			System.out.println(x);
		}*/
		
		// iterator() with while loop - only for collections
		// Iterator<String> it = myList.iterator(); // if ArrayList only has String values
		// Iterator<Employee> it = myList.iterator(); // if ArrayList from Employee class 
		// Iterator<Object> it = myList.iterator(); // if ArrayList contains heterogeneous 
		Iterator it = myList.iterator();
		
		// System.out.println(it.next()); // return the first value in the ArrayList
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Checking ArrayList is empty or not
		// if empty returns true 
		// if not empty returns false
		// System.out.println("Is ArrayList empty?: " + myList.isEmpty());
	
		// Remove specific element - one/single element
		// myList.remove(0);
		
		// Remove all elements
		// myList.clear();
		
		// Remove randomly elements from ArrayList
		// 1) Create a separate list
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add("Welcome");
		
		// Take original myList
		myList.removeAll(myList2);
		System.out.println("After removing multiple elements: " + myList);
	
		// Remove all the elements/clear
		myList.clear();
		System.out.println("Is ArrayList empty?: " + myList.isEmpty());
	}
}
