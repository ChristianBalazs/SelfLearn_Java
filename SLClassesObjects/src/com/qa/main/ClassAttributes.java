package com.qa.main;

public class ClassAttributes {

	//Create a class with 3 attributes /variables inside 
	
	public static class ClassOne{  
		int x ; //variable x of type integer with NO value
		int y = 3;  // variable y of type integer and value 3
		String name = "John";  // variable name of type String with value "John"
		
		final int z = 20;  // variable z of type int with value 20 and FINAL type
	}
	
	// x, y and name = class attributes
	// class attributes also called FIELDS
	
	
	public static void main(String[] args) {
		
		ClassOne myObj = new ClassOne();
		// created myObj object of class ClassOne
		
		System.out.println(myObj.y);  // output 3
		// print the value of y attribute 
		
		myObj.y = 60; 
		// Override the attribute value from 3 to 60
		System.out.println(myObj.y);  // output 60
		// print the new value of y attribute 
		
		
		System.out.println(myObj.x); //output 0
		// x has no value declared inside ClassOne
		
		myObj.x = 15;
		// modify attribute x by adding value of 15
		
		System.out.println(myObj.x); //output 15
		
		
		
		System.out.println(myObj.z); // output 20
		
		// Final variable z CANNOT be changed 
		//myObj.z = 10;  ERROR 
		
		
		// The final keyword is useful when you want a variable to always store the same value
		// The final keyword is called a "modifier".
		

	}

}
