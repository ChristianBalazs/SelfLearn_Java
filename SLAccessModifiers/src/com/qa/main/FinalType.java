package com.qa.main;

public class FinalType {

	// If you don't want the ability to override existing attribute values, 
	// declare attributes as final:
	
	//Example
	
	final int x = 10;
	final double PI = 3.14;
	final String word = "Peace";
	
	
	
	
	public static void main(String[] args) {
	
		FinalType myObj = new FinalType();
		System.out.println(myObj.word); //output Peace
		
		// If want to modify the word attribute :
		// myObj.word = "War";
		//Error - The final field FinalType.word cannot be assigned
		

	}

}
