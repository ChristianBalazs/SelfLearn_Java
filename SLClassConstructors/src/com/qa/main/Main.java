package com.qa.main;

public class Main {

	// A constructor in Java is a special method that is used to initialize objects
	// The constructor is called when an object of a class is created
	// Constructors can also take parameters
	// A constructor must have the same name as the containing class
	// Constructors must not have a return type (not even void)
	
	
	public static void main(String[] args) {
		
		// Instantiating a class refers to creating a new object using that class as a template.
		// Using constructor Cars - create/instantiate fordCar object
		// inside ( ) place values for the 3 variables declared in the constructor
		
		Cars fordCar = new Cars("Ford", 120, "yellow");
		
		System.out.println(fordCar.getColour());  //output yellow
		
		
		//Using a Cars Constructor with one parameter to create an object
		Cars nissanCar = new Cars("Nissan");
		
		System.out.println(nissanCar.getBrand()); //output Nissan
		
		
		
		//Using the third Cars constructor (with no parameters)		
		Cars mazdaCar = new Cars();
		
		System.out.println(mazdaCar.getBrand()); //output null
		// No value recorded for Brand parameter 
		
		
		// Using setBrand() method with mazdaCar object
		mazdaCar.setBrand("Mazda");
		
		System.out.println(mazdaCar.getBrand()); // output Mazda
		
		
		
		
		
		

	}

}
