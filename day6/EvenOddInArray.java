package day6;

public class EvenOddInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		// normal loop
		/*for(int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i] + " even number");
			}
			else {
				System.out.println(a[i] + " odd number");
			
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2 != 0) {
				System.out.println(a[i] + " odd number");
			}	
		}*/
		
		// for each loop
		for(int x : a) {
			if(x%2 == 0) {
				System.out.println(x + " even number");
			}
		}
		
		for(int x : a) {
			if(x%2 != 0) {
				System.out.println(x + " odd number");
			}
		}

	}

}
