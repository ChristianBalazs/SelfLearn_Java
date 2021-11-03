package com.qa.main;

public class BirdConstructor {

	public static class  Bird implements Interfaces.Bird{
		
		// implements from Interfaces.Bird means I already have those two methods
		// to which i include the {body of code}
		
		public void fly() {
			System.out.println("Flew flew flew");
			
		}

		
		public void layEgg() {
			System.out.println("New egg");
			
		}
		
	}
	
	
}
