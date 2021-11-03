package com.qa.main;

public class TypePrivate {

	
	private static String fruit = "apple";
	private static int weight = 130;
	
	


	private static void theFruit() {
		System.out.println("The " + fruit + " has " + weight + " grams");
	}
	
	public static void theFruit2() {
		System.out.println("The " + fruit + " has " + weight + " grams");
	}
	
	
	//Created Getters and Setters to access variable values from main class or other classes
	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		TypePrivate.weight = weight;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//Calling a private method inside the same class where is created 
		theFruit(); // output The apple has 130 grams
		
		//Create an object of class TypePrivate
		TypePrivate myNewFruit = new TypePrivate();
		
		//Modify the weight attribute for that object
		//CAn modify the weight HERE because this code is inside same class as weight variable
		myNewFruit.weight = 200;
		
		//Call the private method again
		theFruit();//output The apple has 200 grams
		
		
	}

}
