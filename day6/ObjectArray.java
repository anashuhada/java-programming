package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		// heterogeneous data
		Object a[] = {100, 10.5, 'A', "Welcome", true};
		
		for(Object x : a) {
			System.out.println(x);
		}
		
		for(int z = 0; z < a.length-1; z++) {
			System.out.println(a[z]);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

}
