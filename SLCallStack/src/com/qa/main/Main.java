package com.qa.main;
 

//JAVA CALL STACK
//The Call Stack is what Java uses to keep track of method calls


public class Main {

	public static void main(String[] args) {
		
		System.out.println(Dice.rollTwoDTwenty());
		
		// for the command above - The call stack is:
		// 1 - run rollDtwenty()
		// 2 - set up int total = 0
		// 3 - set up total = total + rollAgain()function
		// 4 - run rollAgain() 
		// 5 - run random().nextint() method
		// 6 - return the value from random into variable total
		// 7 - run next line from rollDtwenty
		//...
	
		
		
		//SCOPE
		// Three main levels: 
		
		// 1. Class level/Instance scope
		//variables are inside the class but outside of methods. 
		//Generally these variables will be defined at the top of the class.
		
		//Example - see ClassScope.java
		
		
		// 2. Method/Local scope
		// Variables are temporary and generally only used in the method that they are declared in
		
		//Example - see MethodScope.java
		
		
		// 3. Loop Scope
		// Variables declared and accessible ONLY inside a loop declaration 
		
		//Example - see LoopScope.java
		
		
		
		
		
		
		
		

	}

}
