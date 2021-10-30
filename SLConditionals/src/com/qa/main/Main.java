package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
		//Conditionals in Java allow the developer to check values 
		//and make decisions based off the answer of that check.
		
		
		// If Conditional
		//if (condition) { execude this code};
		
		// If Else Conditional
		//if (condition) {execute this} else {execute this code}
		
		// If Else if 
		// if(condition) {execute} else if (condition){execute} else{execute} 
	
		
		//Example 1:
		String car = "Ford";
		
		if (car == "Ford") {
			System.out.println("The car is a Ford");
		}
				
		
		
		
		//Example 2:
		boolean isLightOn = false;
		
		if(isLightOn) {
			System.out.println("The light is ON.");			
		}else {
			System.out.println("The light is OFF");
		}
		
		
		
		//Example 3:
		 int number = 50;

	        if(number <= 20) {
	            System.out.println("Number is less than or equal to 20");
	        } else if(number < 40) {
	            System.out.println("Number is between 20 and 40");
	        } else {
	            System.out.println("Number is greater than or equal 40");
	        }
		
		

	}

}
