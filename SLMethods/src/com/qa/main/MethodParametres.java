package com.qa.main;

public class MethodParametres {

	// Information can be passed to methods as parameter.
	// Parameters act as variables inside the method.
	
	
	
	//Example with one parameter - type string
	static void myMethod(String firstName) {
		System.out.println(firstName + " Reynolds");
	}
	
	
	
	//Example with two parameters - one string and one int	
	static void myMethod2(String name, int age) {
		System.out.println(name + " is " + age + " years old");
	}
	
	
	
	// void means no value returned
	// if return is needed, use return keyword inside the method
	
	//Example with int return
	static int myIntMethod(int x) {
		return x + 5;		
	}
	
	
	//Example with 2 parameters and return 
	static int myIntMethod2(int x, int y) {
		return x + y;
	}
	
	
	//Example with 
	
	
	public static void main(String[] args) {
		
		myMethod("Liam"); //output Liam Reynolds
		myMethod("Dianne"); // output Dianne Reynolds
		
		
		myMethod2("John", 26); // output John is 26 years old
		myMethod2("Monica", 40);  //output Monica is 40 years old
		
		
		
		System.out.println(myIntMethod(10)); //output 15 (10 +5)
		
		System.out.println(myIntMethod2(5, 2)); //output 7 (5 +2)
		
		// can store the result in a variable - example
		int z = myIntMethod2(5, 2); //created variable z to store the value of the method
		System.out.println(z); // same output 7 (5+2)


		
		
		
	}
	
	
	
	
	
	
	
}
