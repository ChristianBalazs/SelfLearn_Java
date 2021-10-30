package com.qa.main;

public class Operators {

	
	//OPERATORS
	
	// ==        is equal to
	// !=        not equal to
	
	// <		less than
	// >		greater than
	
	// <=		less or equal to 
	// >=		greater or equal to
	
	// &&		AND
	// ||		OR
	
	// &		Bitwise AND
	// |		Bitwise OR
	
	//instanceof  Compares and object to a specific type
	
	
		
	public static void main(String[] args) {
		
		
		//is Equal to 		
		int number = 10;

        if(number == 10) {
            System.out.println("Number is equal to 10");
        } else {
            System.out.println("Number is not equal to 10");
        }
		
        
        
        //Not Equal to 
        int number2 = 8;

        if(number2 != 10) {
            System.out.println("Number is not equal to 10");
        } else {
            System.out.println("Number is equal to 10");
        }
        
        
        
        //Less than
        int number3 = 8;

        if(number3 < 10) {
            System.out.println("Number is less than to 10");
        } else {
            System.out.println("Number is greater than 10");
        }
        
        
        //Greater than
        int number4 = 11;

        if(number4 > 10) {
            System.out.println("Number is greater than to 10");
        } else {
            System.out.println("Number is less than 10");
        }
        
        
        //Less than or equal
        int number5 = 10;
        
        if(number5 <= 10) {
            System.out.println("Number is less than or equal to 10");
        } else {
            System.out.println("Number is greater than 10");
        }
        
       
        //Greater than or equal
        int number6 = 10;

        if(number6 >= 10) {
            System.out.println("Number is greater than or equal to 10");
        } else {
            System.out.println("Number is less than 10");
        }
        
        
        
        //Logical And
        int num = 10;
        int num2 = 20;

        if(num >= 10 && num2 == 20) {
            System.out.println("Number is greater than or equal to 10 and Number 2 is equal to 20");
        } else {
            System.out.println("Number is less than 10, or Number 2 is not equal to 20");
        }
        
        
        
        //Logical Or
        int numb = 9;
        int numb2 = 20;

        if(numb >= 10 || numb2 == 20) {
            System.out.println("Number is greater than or equal to 10 or Number 2 is equal to 20");
        } else {
            System.out.println("Number is less than 10, and Number 2 is not equal to 20");
        }
        
        
        
        //Type Comparison
        
//        Car Nissan = new Car();
//        if(Nissan instanceof Car) {
//            System.out.println("This is a Car");
//        } else {
//            System.out.println("This is not a Car");
//        }
        
        // checking if Variable Nissan is a instance of class Car()
        
        
        
        
        

	}

}
