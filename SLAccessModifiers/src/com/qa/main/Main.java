package com.qa.main;

public class Main {

	//IMPORTANT:
	
	// Two large groups of modifiers
	// Access Modifiers - controls the access level
	// Non-Access Modifiers - do not control access level, but provides other functionality
	
	
	
	//ACCESS MODIFIERS - for Classes:	
	// public - The class is accessible by any other class
	// default - The class is only accessible by classes in the same package
	
	
	
	//ACCESS MODIFIERS - for Attributes, Methods and Constructors:
	// public - The code is accessible for all classes
	// private - The code is only accessible within the declared class
	// default - The code is only accessible in the same package.
	// protected - The code is accessible in the same package and subclasses.
	
	
	//NON-ACCESS MODIFIERS - for Classes:
	//final - The class cannot be inherited by other classes
	//abstract - The class cannot be used to create objects
	
	
	
	//NON-ACCESS MODIFIERS - for Attributes and Methods:
	//final - Attributes and methods cannot be overridden/modified
	//static - Attributes and methods belongs to the class, rather than an object
	//abstract - Can only be used in an abstract class, and can only be used on methods
	//transient - Attributes and methods are skipped when serializing the object containing them
	//synchronized - Methods can only be accessed by one thread at a time
	//volatile - The value of an attribute is not cached thread-locally, and is always read from the "main memory"
	
		
	
	
	public static void main(String[] args) {
		
		//CALLING a public and static method nameAndAge() from another class
		TypePublic.nameAndAge(); //output John is 28
		
				
		//CALLING a public not-static method
		//Cannot call ageAgain() method because is not a static method, so it belongs to objects from that class 
		//TypePublic.ageAgain(); ERROR
		
		// Solution - create an object of TypePublic class, afterwards run the method
		TypePublic Object1 = new TypePublic();
		Object1.ageAgain(); //output John is 28
		
		//Change value of variable age inside Object1
		// Can change attributes values because age variable is public not private
		Object1.age = 15;
		Object1.ageAgain(); //output John is 15
		
		
				
		
		//CALLING a private method from another class 
		//TypePrivate.theFruit();
		//ERROR - The method theFruit() from the type TypePrivate is not visible
		// Solution - TypePrivate.java 
		
		
		
		
		
		//CALLING a public method from another class
		// theFruit2() method is created using private parameters/variables
		TypePrivate.theFruit2();  //outcome The apple has 130 grams
		
		
		//Create a object of the class TypePrivate
		TypePrivate  myFruit = new TypePrivate();
		
		
		//Change the PRIVATE weight variable to 100
		// Get Error because weight variable is not visible 
		// myFruit.weight = 100;
		//SOLUTION: create Getters and Setters inside TypePrivate class to access the variables
		
		//Modify the weight attribute 
		myFruit.setWeight(100);
		
		TypePrivate.theFruit2();//output The apple has 100 grams
		
		
		

	}

}
