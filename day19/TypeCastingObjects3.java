package day19;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
		/*
		Rule #1: conversion is valid or not
		- The type of d and C must have relationship; either parent-child or child-parent
		
		Rule #2: assignment is valid or not
		- c must be either same type or child of A
		
		Rule #3: the underlying object type of d must be either same or child of C*/

		// Object var = new Object();
		// A b = (C) d;
		
		// Example #1
		/*Object obj = new String("Welcome");
		StringBuffer sBuffer = (StringBuffer) obj; // Rule #1 valid
												   // Rule #2 valid
												   // Rule #3 invalid*/
		
		// Example #2
		/*String s = new String("Welcome");
		StringBuffer sBuffer = (StringBuffer) s; // Rule #1 invalid*/
		
		// Example #3
		/*Object obj = new String("Welcome");
		StringBuffer sBuffer = (StringBuffer) obj; // Rule #1 valid
												   // Rule #2 valid
												   // Rule #3 invalid*/
		
		// Example #4
		/*Object obj = new String("Welcome");
		StringBuffer sBuffer = (String) obj; // Rule #1 valid
		   									 // Rule #2 invalid*/
		
		// Example #5
		/*String s = new String("Welcome");
		StringBuffer sBuffer = (String) s; // Rule #1 valid
										   // Rule #2 invalid*/
		
		// Example #6
		/*Object obj = new String("Welcome");
		StringBuffer sBuffer = (StringBuffer) obj; // Rule #1 valid
		   										   // Rule #2 valid
												   // Rule #3 invalid*/
		// Example #7
		Object obj = new String("Welcome");
		String s = (String) obj; // Rule #1 valid
		   						 // Rule #2 valid
		   						 // Rule #3 valid
		System.out.println(s);
	}

}
