package com.qa.main;

public class MethodOverload {

	
	//method overloading: multiple methods can have the same name with different parameters:
	
	
	//Example - two methods that add numbers of different type:
	
	static int plusMethodInt(int x, int y) {
		  return x + y;
		}
	
	static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
	
	
	
	//Overload example - two methods but with the same name 
	
	static int plusMethod(int x, int y) {
		  return x + y;
		}

	
	static double plusMethod(double x, double y) {
		  return x + y;
		}
	
	
	
	
	public static void main(String[] args) {
		
		
		//Running the methods to add two numbers of different type 
		int myNum1 = plusMethodInt(8,5);
		double myNum2 = plusMethodDouble(4.3, 6.26);
		
		System.out.println("int: " + myNum1);  // output 13
		System.out.println("double: " + myNum2);  //output 10.56
		
		
		
		//Running the Overload example with one method
		
		int num1 = plusMethod(8, 5);
		double num2 = plusMethod(4.3, 6.26);
		
		System.out.println("int: " + num1);   // 13
		System.out.println("double: " + num2);  // 10,56
		
		
		
		
		

	}

}
