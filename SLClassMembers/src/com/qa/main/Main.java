package com.qa.main;


//Class members are either variables or methods within a class.
//Each class member can be an:
	//instance member, 
	//a static class member, 
	//and can also be final. 


//Instance class member
//attributes or methods which need to have an instance of the class instantiated before it can be used 
// Example - InstanceMembers.java

public class Main {

	public static void main(String[] args) {
	
		Members firstMember = new Members("John", "Rimmer");
		// firstMember = object of class Members
		// "John" = value that belongs to the firstMember instance of class Members 
		
		Members secondMember = new Members("Dianne", "Lister");
		// secondMember = another object of class Members
		
		
		System.out.println(firstMember.getFirstName());
		// print John
		
		System.out.println(firstMember.getPeopleNo());
		// print 2 , because 2 members(instances) have been created inside class Members
		
		
		

	}

}
