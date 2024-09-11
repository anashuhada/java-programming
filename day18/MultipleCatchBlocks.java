package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		String s = null;
		
		// if not sure what error exception, can create multiple catch blocks
		try {
		System.out.println(s.length()); // NullPointerException
		}
		/*catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getName());
		}
		
		System.out.println("Program finished...");
	}

}
