package day14;

public class PassingParametersToMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for(String value : args) {
			System.out.println(value);
		}
		
	}

}
