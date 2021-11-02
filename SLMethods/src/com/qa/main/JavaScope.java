package com.qa.main;

public class JavaScope {

	// Variables are only accessible inside the region they are created = SCOPE
	
	
	
	// METHOD Scope
	// Variables declared directly inside a method are available anywhere in the method 
	// following the line of code in which they were declared
	
	
	static int addNum(int x) {
		int a = 7;  // variable a declared inside method addNum
		return a + x ;		
	}
	
	
	
	//BLOCK Scope
	//block of code refers to all of the code between curly braces {}
	//Variables declared inside blocks of code are only accessible by the code between the curly braces
	
	static int ifNum(int y) {		
		if(y < 10) {
			int z = 5; // can ONLY access z inside this {}
			return y * z;
		}else {
			// return y + z;  //CANNOT access variable z inside this {}
			return y;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Method scope example
		System.out.println(addNum(5)); // output 12 
		
		//if we want to access variable a outside addNUm method
		//System.out.println(a);  // ERROR - variable a cannot be found
		
		
		
		//BLOCK scope example
		System.out.println(ifNum(6)); //output 30
		
		System.out.println(ifNum(15)); //output 15
		
		
		

	}

}
