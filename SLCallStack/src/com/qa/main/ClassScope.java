package com.qa.main;


// Example of Class level/ instance scope
// Variable and methods inside the class but outside the methods


public class ClassScope {
	
	 
	public static String message = "Hello World!";
	
	
	public static void method1() {
		System.out.println(message);
	}
			
		
	public static void main(String[] args) {
		method1();

	}

}
