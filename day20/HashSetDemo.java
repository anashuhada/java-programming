package day20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration
		// Heterogeneous data
		HashSet mySet = new HashSet();
		// Set mySet = new HashSet();
		
		// Homogeneous data
		// HashSet<String> mySet = new HashSet<String>();
		
		// Adding elements into HashSet
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("Welcome");
		mySet.add(true);
		mySet.add('A');
		mySet.add(100);
		mySet.add(null);
		mySet.add(null);
		
		// Size of HashSet
		System.out.println(mySet.size());
		
		// Printing in HashSet
		System.out.println(mySet); // not in preserved in the same order [null, A, 100, 10.5, Welcome, true] 
		
		// Removing element - use direct value, not an index value
		mySet.remove(10.5);
		System.out.println("After removing: " + mySet); // [null, A, 100, Welcome, true]
		
		// Inserting element - impossible in HashSet
		
		// Access specific element - impossible in HashSet
		
		// Convert HashSet -> ArrayList
		ArrayList al = new ArrayList(mySet); // [null, A, 100, Welcome, true]
		System.out.print(al.get(3));
		
		// Read all the elements using loops
		// Normal loop is impossible
		// So use for each loop
		/*for(Object x : mySet) {
			System.out.print(x);
		}*/
		
		// Using iterator()
		Iterator<Object> it = mySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Clearing all the elements in HashSet
		mySet.clear();
		System.out.println(mySet);
		System.out.println(mySet.isEmpty());
	}

}
