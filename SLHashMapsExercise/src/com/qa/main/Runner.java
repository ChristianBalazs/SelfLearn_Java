package com.qa.main;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		
		HashMap< String, Integer> mapColours = new HashMap<>();
		
		  mapColours.put("Red", 1);
		  mapColours.put("Green", 2);
		  mapColours.put("Black", 3);
		  mapColours.put("White", 4);
		  mapColours.put("Blue", 5);
		  
		// Write a Java program to test if a map contains a mapping for the specified key.
		  
		  //Check if Green key exists
		  System.out.println("The original map : " + mapColours);
		  
		  System.out.println("Does Green key exist ?");
		  if (mapColours.containsKey("Green")) {
			  System.out.println("Yes, 'Green' has value of:  " + mapColours.get("Green"));			  
		  }else {
			  System.out.println("No, Green is not present");
		  }
		  
		
		  
		//Check if Orange key exists 
		  System.out.println("Does Orange key exist ?");
		  if (mapColours.containsKey("Orange")) {
			  System.out.println("Yes, 'Orange' has value of:  " + mapColours.get("Orange"));			  
		  }else {
			  System.out.println("No, Orange is not present");
		  }
		  
		  
		  //If no of keys is less than 6 add another key-value pair
		  
		  if ( mapColours.size() < 6 ) {
			  mapColours.put("Pink", 6);
			  System.out.println(mapColours);
		  }
		  
		 
		  

	}

}
