package com.qa.main;

public class Main {
	
	
	//SINGLE Dimensional Array
	
	//Syntax :
	// String [] or int[] - define the variable type with square brackets []
	
	//Arrays - helps  to store many values in a single variable
	//Each value in an array is referred to as an element and that element is indexed.
	
	//Example 1 - creating a an empty array
	// can add data later	
	public int[] ageArray; // array of integers
	
	
	//Example 2 - creating the variable as an array and then initialising it with a dataset.	
	public static int[] ageArray2 = {23,56,18,34,30};
	
	
	//Example 3 - create an empty array but specify the length of the array 
	public int[] agerArray3 = new int[5];
	
		
	
	
	
	//MULTI Dimensional Arrays
	// Arrays that store arrays inside them
	// Each of the indexes within a multi dimensional array stores an array within them
	
	
	public static void main(String[] args) {
		
		
		//Print ageArray2
		System.out.println(ageArray2); //print memory location of the Array
		
		//Print again ageArray2 using a For each loop
		for (Integer i : ageArray2) { // use for each loop to iterate through the array
			System.out.println(i);
		} // print each element of the array on individual lines
		
		

		
		
		
		

	}

}
