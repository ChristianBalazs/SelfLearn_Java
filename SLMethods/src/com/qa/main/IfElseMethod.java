package com.qa.main;

public class IfElseMethod {

	//It is common to use if...else statements inside methods
	
	// Example:
	
	static void checkAge(int age) {
		if(age > 18) {
			System.out.println("Access granted!");
		}else {
			System.out.println("Acees denied!");
		}
	}
		
	
	public static void main(String[] args) {
		
		checkAge(20);  //output Access granted
		checkAge(17);  //output Access denied
		

	}

}
