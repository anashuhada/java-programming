package day19;

// upcasting: lower -> higher
// downcasting: higher -> lower
// can be primitive/non-primitive

// parent
class Animal {}

// child
class Dog extends Animal {}

class Cat extends Animal {}


public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		// Rule #1: conversion is valid or not
		// The type of d and C must have relationship; either parent-child or child-parent
		// upcasting
		/*Animal an = new Dog();
		Cat ct = (Cat)an; // valid as per Rule #1*/
		
		// Dog d = new Dog();
		// Cat ct = (Cat)d; // invalid - cat and dog has no relationship
		
		// Rule #2: assignment is valid or not
		// c must be either same or child of A
		/*Animal an = new Dog();
		Cat ct = (Cat)an; // valid as per Rule #2*/
		
		/*Animal an = new Dog();
		Cat ct = (Dog)an; // valid as per Rule #1
						  // invalid as per Rule #2*/
		
		// Rule #1 is invalid - will get an exception
		
		// Rule #3: the underlying object type of d must be either same or child of C
		/*Animal an = new Dog();
		Cat ct = (Cat)an; // runtime error, invalid as per Rule #3*/
	
		// Rule #1, #2, #3
		Animal an = new Dog(); // underlying object new Dog();
		Dog d = (Dog)an; // Rule #1 valid
						 // Rule #2 valid
						 // Rule #3 valid
						 // All rules must be valid 
	}

}
