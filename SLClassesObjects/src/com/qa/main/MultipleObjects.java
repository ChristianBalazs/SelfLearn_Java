package com.qa.main;

public class MultipleObjects {

	//Create a class with multiple attributes (3 attributes)
	
	public static class Multi{
		
		String firstName = "John";
		String lastName = "Doe";
		int age = 20;
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Create multiple objects from class Multi
		
		Multi Object1 = new Multi();
		Multi Object2 = new Multi();
		
		System.out.println(Object1.age); //output 20
		// print value of age attribute for Object1
		
		System.out.println(Object2.age);  //output 20
		// print value of age attribute for Object1
		
		
		// CHANGE the attribute values 
		// in one object, without affecting the attribute values in the other
		Object2.age = 35; // changed age attribute for Object2
		System.out.println(Object1.age); //output 20
		System.out.println(Object2.age); //output 35
		
		
		
		//Multiple Attributes
		
		System.out.println("Name: " + Object1.firstName + " " + Object1.lastName);
		//Output Name: John Doe
		
		
		System.out.println(Object1.firstName + " is " + Object1.age + " years old");
		// output JOhn is 20 years old
		
		
		//Change multiple attributes for one object - Object1
		Object1.firstName = "David";
		Object1.age = 15;
		
		System.out.println("Name: " + Object1.firstName + " " + Object1.lastName);
		// Output Name: David Doe 
		
		System.out.println(Object1.firstName + " is " + Object1.age + " years old");
		// output David id 15 years old 
		
		
		
		
	}

}
