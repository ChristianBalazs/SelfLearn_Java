package com.qa.main;

public class Main {

	
	// Java is an object-oriented programming language.
	// Everything in Java is associated with classes and objects, 
	// along with its attributes and methods.
	
	//The car has attributes, such as weight and color, and methods, such as drive and brake.
	
	//A Class is like an object constructor, or a "blueprint" for creating objects.
	
	//To create a class, use the keyword class:
	
	public static class theClass{  //created a class called theClass
		int x = 5;			// inside the class created a int variable called x which has value 5
		String text = "some text";
		int y = 10;
	}
	
	
	
	public static void main(String[] args) {
		
		theClass myObject = new theClass();
		// created an object of the class theClass
		
		System.out.println(myObject.text);  // output some text
		// print out .text attribute of myObject which is some text
		
		System.out.println(myObject.x); // output 5
		// print out x attribute of myObject
		
		
		
		// USING MUltiple Classes
		// create an object of a class and access it in another class.
		
		//Example:
		
		SecondClass item1 = new SecondClass();
		
		System.out.println(item1.a); //output 20
		// print variable/attribute a of item1 object
		
		System.out.println(item1.song); // output Till I come
		// print attribute song of item1 object
		
		
		
		

	}

}
