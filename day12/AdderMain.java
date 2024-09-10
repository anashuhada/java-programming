package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addObj = new Adder();
		addObj.sum();
		addObj.sum(100, 200);
		addObj.sum(300, 50.5);
		addObj.sum(33.33, 100);
		addObj.sum(100, 200, 300);
	}

}
