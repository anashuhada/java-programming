package day12;

public class BoxMain {

	public static void main(String[] args) {
		
		// Box b = new Box(); // because not passing any params, it will be the default constructor
		// System.out.println(b.volumeBox());
		
		// one object one constructor 
		// Box b = new Box(10.5,10.5,10.5);
		// System.out.println(b.volumeBox());
		
		// take constructor Box(double len)
		Box b = new Box(10.5);
		System.out.println(b.volumeBox());
	}

}
