package com.qa.main;

import com.qa.main.BirdConstructor.Bird;
import com.qa.main.MultiInterfaceConstructor.FlyingPig;
import com.qa.main.PigConstructor.Pig;

public class Main {

	// Interface is a completely abstract class that is used to 
	// group related methods with empty bodies.	
	// Not the same as abstract classes 
	
	//Example - InterfaceAnimal.java	

		

	
	
	
	
	public static void main(String[] args) {
		
		Pig myPig = new Pig(); // created myPig object from class Pig
		
		myPig.animalSound();  //called animalSound() method on object myPig
		
		myPig.run(); // called run() method 
		
		
		
		Bird mybird = new Bird(); //created myBird object from class Bird
		
		mybird.fly();
		mybird.layEgg();
		
		
		
		
		FlyingPig mightyPig = new FlyingPig();
		// created object mightyPig of class FlyingPig
		// class FlyingPig was created with implementation of both Animal and Bird interfaces
		
		mightyPig.animalSound(); 
		//calling animalSound()method as created inside FlyingPig class
		
		mightyPig.fly();
		// calling fly() method
		
		mightyPig.layEgg();
		//calling layEgg() method BUT no OUTPUT because the body of this method is missing
		// layEgg() body is empty 
		
		
		

	}

}
