package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program is started...");
		System.out.println("Program in progress...");
		
		// open file
		FileInputStream file = new FileInputStream("C:\\text.txt");
		
		// try...catch way
		/*try {
		// pause for 5 seconds 
		Thread.sleep(5000); // how long to wait/pause the next code to be executed, in millisecond
		}
		catch(InterruptedException e) {
			// System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}*/
		
		Thread.sleep(5000);
		
		System.out.println("Program is started...");
		System.out.println("Program in progress...");

	}

}
