package com.qa.main;

public class ForEach {

	public static void main(String[] args) {
		
		//For Each Loop is used ONLY to loop through elements in an array
		
		//for( variableName : arrayName){code to execute}
		
		
		//Example:
		
		String[] cars = {"Volvo", "Ford", "Nissan", "Tesla"};// create cars array with 4 variables/elements inside
		
		for (String i : cars) {  // i : cars = variable inside string cars
			System.out.println(i); // print i , will print each element on a separate line 
		}
		
		
		
		//Example 2:
		
		String[] fruits = {"apple", "strawberry", "orange", "pear"};
		for(String i : fruits) {
			System.out.println("I like " + i);
		}
		
		
		
		//Example 3:
		
		Integer [] numbers = {2, 15, 7, 9};
		for (Integer i : numbers) {
			System.out.println("My fav no is: " + i);
		}

	}

}
