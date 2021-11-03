package com.qa.main;


//Created public Cars class
public class Cars {
	
	
	// Created 3 variables which are private
	// Private means can be accessed in the Main ONLY via Setters and Getters methods
	private String brand;
	private int maxSpeed;
	private String colour;
	
	
	// Created Cars Constructor method with the variables declared above
	// Cars constructor now has 3 parameters 
	public Cars(String brand, int maxSpeed, String colour) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
	}

	
	// Overloading
	// Constructors can also be 'overloaded' 
	// you can have multiple constructors for a class with different input parameters
	
	
	// Example Cars Constructor win ONLY ONE parameter 	
	public Cars(String brand) {
		super();
		this.brand = brand;
	}
	
		
	
	//Cars Constructor with no parameters	
	public Cars() {				
	}
	
	
	
	
	//Created Getters and Setters methods to access and modify each object variables
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
}
