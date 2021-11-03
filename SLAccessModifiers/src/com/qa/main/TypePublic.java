package com.qa.main;


// Created a public class
public class TypePublic {

	//Create a public and static variable of type String
	public static String name = "John";
	
	//Create a public and static variable of type int
	public static int age = 28;
	
	
	//Create a public and static method which belongs to this class
	public static void nameAndAge() {
		System.out.println(name+ " is " + age);
	}
	
	
	//WHY Static?
	// So all variables/methods belong to the class not an object instantiated from the class
	
	
	
	
	//Create a public method which belongs to an object of the class
	public void ageAgain() {
		System.out.println(name + " is " + age );
	}
	
	
}
