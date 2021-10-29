package com.qa.main;

// FLOW OF CONTROL

// flow of control is the order in which code is executed by Java.
// code execution will begin in the main method
// the first line is called followed by the second, then the third, and so on.


// Created Methods Class inside the same package
// Created several methods inside that class


public class Main {

	public static void main(String[] args) {
		
	// Call those methods from Methods.java class
		
		Methods.method1(); // print Hello
		
		Methods.method2(); // print World
		
		System.out.println(Methods.method3());	// return ! which then is printed 
		
		
		//System.out.println() - Each word is printed on a new line
		//System.out.print()   - Each work printed on the same line, one after another
		
		//Example:
		System.out.println("===");
		System.out.println("Sun");
		System.out.println("goes");
		System.out.println("down");
		
		//Vs.
		System.out.println("===");
		System.out.print("Sun");
		System.out.print("goes");
		System.out.print("down");
		
		
		
		
		
		
		

	}

}
