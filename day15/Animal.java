package day15;

public class Animal {
	
	String color = "white";
	
	void eat() {
		System.out.println("Eating...");
	}
	
}

class Dog extends Animal {
	
	String color = "black";
	
	void displayColor() {
		// will invoke parent class variable
		System.out.println(super.color);
	}
	
	void eat() {
		// System.out.println("Eating bread...");
		super.eat();
	}
	
}