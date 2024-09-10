package day12;

public class Box {
	
	double width, height, depth;
	
	// constructor initializes/assigns data to variables
	Box() {
		
		/*width = 0;
		height = 0;
		depth = 0;*/
		
		// other way; use single statement because the values are same
		width = height = depth = 0;
	}
	
	// constructor overloading conditions same as method overloading
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	double volumeBox() {
		return width * height * depth;
	}
}
