package com.qa.main;

public class Main {

	
	//Methods are declared within a class, and that they are used to perform certain actions
	
	
	//Create a method:	
	static void myMethod() {
		System.out.println("Hellow World");
	}
	
	
	//STATIC vs PUBLIC
	// Static method means that it can be accessed without creating an object of the class
	// Public method - can only be accessed by objects
	
	
	//Static method
	static void myStaticMethod() {
		System.out.println("Text from a static method");
	}
	
	
	//Public method
	public void myPublicMethod() {
		System.out.println("Public method executed here");
	}
	
	
	
	public static void main(String[] args) {
		
		// Calling the method
		myMethod();
		
		
		//Calling the static method
		myStaticMethod();
		
		//Calling the public method 
		//myPublicMethod(); ERROR Cannot make a static reference to the non-static method
		
		//Solution: create an object of the class and call the method
		Main myObject = new Main();  // created an object from class Main where the method exists
		myObject.myPublicMethod();  // calling the method via the object
		
		
		
		

	}

}
