package com.qa.main;

public class MultiInterfaceConstructor {
	
	// Created a class that implements TWO interfaces
	// Interface.Animal and Interface.Bird

	public static class FlyingPig implements Interfaces.Animal, Interfaces.Bird{

		@Override
		public void fly() {
			System.out.println("The Pig can fly");
			
		}
		
		@Override
		//Left the body of this method empty
		public void layEgg() {			
			
		}

		@Override
		public void animalSound() {
			System.out.println("Groh grohh");
			
		}

		@Override
		public void run() {
			System.out.println("Vruuuuummm");
			
		}
		
	}
	
	
}
