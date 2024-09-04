package day7;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		
		int a[] = {100,200,100,300,100,400,200};
		int num = 200; // value from the array
		int count = 0; // calculate how many duplicates of num
		
		for(int x : a) {
			if(x == num) {
				count++;
			}
		}
		
		System.out.println(num + " has " + count + " duplicates");
	
	}
}
