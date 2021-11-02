package com.qa.main;

public class Main {

	// Method is a block of code which only runs when it is called.
	// You can pass data, known as parameters, into a method.
	// Methods are used to perform certain actions, and they are also known as functions.
	// A method must be declared within a class.
	
	// Syntax:		
	static void myMethod() {      
	    // code to be executed    
	  }
	
	// myMethod() is the name of the method
	// static means method belongs to the class not to an object of the class
	// void means the method does not have a return value
	
	
	
	public static void myMethod1() {
		System.out.println("I just got a method running");
	}
	
	
	
	
	public static void main(String[] args) {
		
		myMethod1();  //calling the method created inside the class Main
		
		
		

	}

}
