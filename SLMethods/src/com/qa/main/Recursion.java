package com.qa.main;

public class Recursion {

	//Recursion is the technique of making a function call itself.
	
	
	// Create a method where recursion is used to add a range of numbers together 
	// by breaking it down into the simple task of adding two numbers:
	public static int theSum(int k) {
		if (k > 0) {
			return k + theSum(k - 1);
		}else {
			return 0;
		}
	}
	
	//EXPLANATION:
	//When theSum() function is called, it adds parameter k to the sum of all numbers smaller than k 
	// and returns the result. When k becomes 0, the function just returns 0. 
	//When running, the program follows these steps:
	// 10 + sum(9)
	// 10 + ( 9 + sum(8) )
	// 10 + ( 9 + ( 8 + sum(7) ) )
	// ...
	// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
	// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
	
	
	
	public static void main(String[] args) {
		
		
		int result = theSum(10);
		System.out.println(result); // output 55
		
		int result1 = theSum(5);
		System.out.println(result1); // output 15
		
		

	}

}
