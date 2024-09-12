package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration
		// HashMap hm = new HashMap();
		// Map m = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		System.out.println(hm); // {101=John, 102=David, 103=Mary, 104=Scott}
		
		// Size of HashMap
		System.out.println(hm.size()); // 4
		
		// Remove pair - pass the key
		hm.remove(103); // 103 is key of pair
		System.out.println(hm); // {101=John, 102=David, 104=Scott}
		
		// Access value of the key - pass the key
		System.out.println(hm.get(102)); // 102 is key
		
		// Get all the keys 
		System.out.println(hm.keySet()); // [101, 102, 104]
		
		// Get all the values
		System.out.println(hm.values()); // [John, David, Scott]
		
		// Get all the pairs
		System.out.println(hm.entrySet()); // [101=John, 102=David, 104=Scott]
		
		// Reading data from HashMap
		for(int k: hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
		}
		
		// Using iterator()
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// Clear 
		hm.clear();
		System.out.println(hm.isEmpty()); // true
	}

}
