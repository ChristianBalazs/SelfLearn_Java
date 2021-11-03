package com.qa.main;

	//created a custom AccessMethods class
public class AccessMethods { 

	
	//Created a method with no parameter
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	
	//Created a method with one parameter of type int  
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: "+ maxSpeed);
	}
	
	
	
	public static void main(String[] args) {
	
		//Create a myCar object of class AcessMethods so we can use the methods inside
		AccessMethods myCar = new AccessMethods();
		
		//Run each method from the class
		myCar.fullThrottle();  //output The car is going as fast as it can!
		
		myCar.speed(130); //output Max speed is: 130
		
		
		
		//Good practice to create an object of a class and access it in another class.

	}

}
