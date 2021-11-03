package com.qa.main;


public class PigConstructor {
	
	
	// USE implements keyword to access the interface methods
	// Example:
	
	public static class Pig implements Interfaces.Animal{
		public void animalSound() {
			System.out.println("The pig says Oink");
		}		
		
		public void run() {
			System.out.println("Zzzz");			
		}
	}
	
	
}
