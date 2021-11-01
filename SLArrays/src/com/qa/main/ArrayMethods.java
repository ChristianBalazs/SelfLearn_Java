package com.qa.main;

public class ArrayMethods {
	
	
	//To create an arrays of integers:
	// int[] myNum = {10, 20, 30, 40};
	
	// To create an array of String
	// String[] cars = {"Dacia", "Volvo", "Honda", "Tesla"}; 
	
	
	static String[] cars = {"Dacia", "Volvo", "Honda", "Tesla"}; 
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		//Access element at certain index position
		System.out.println(cars[1]); // print Volvo, item at index 1
		System.out.println(cars[0]); //print Dacia
		
		
		//Change and Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]); //will print Opel instead of Dacia
		
		
		//Array length		
		System.out.println(cars.length); // print 4
		
		
		
		System.out.println("=========");
		
		
		//Loop through an array using FOR LOOP:
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]); //print variable i of array cars
		}
		
		System.out.println("======");
		
		
		
		//Loop through an array using FOR EACH LOOP:
		for(String i:cars) {
			System.out.println(i);
		}
		
			
		

	}

}
