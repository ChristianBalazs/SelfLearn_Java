package com.qa.main;

public class Members {

	private String firstName; //
	private String lastName;
	// firstName and lastName are NOT static 
	// belong to instances of the class
	
	private static int peopleNo = 0;
	// peopleNo = static variable, belong to the class
	
		
	// Have a class InstanceMembers which has two variables
	// and getter and setter method for each variable 
	
	
	//Constructor	
	public Members(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
		peopleNo++;
	}

	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public static int getPeopleNo() {
		return peopleNo;
	}


	public static void setPeopleNo(int peopleNo) {
		Members.peopleNo = peopleNo;
	}
	
	
	
	
	
}
