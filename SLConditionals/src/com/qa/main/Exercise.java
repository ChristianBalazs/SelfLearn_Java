package com.qa.main;

public class Exercise {
	
	
	
	//Exercise1
	
	//Create a method which accepts 3 parameters, 2 integers and a boolean.
	//If the boolean is true, the method will return a sum of the two numbers,
	//and it if is false it will return the multiplication of the two numbers.
	// For example: 
	//Input (1, 2, true) -> 3
	//Input (3, 3, false) -> 9
	//Input (1, 1, true) -> 2
	
	
	//Solution
	
	public static int calc(int x, int y, boolean theBool){
		
		if(theBool == true) {
			return x + y;
		}else {
			return x * y;
		}
		
	}

	
	
	// Exercise 2
	//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
	//If they both go over 21 then return 0.
	//For example:
	 	//play (10, 21) -> 21
	 	//play (20, 18) -> 20
	 	//play (1, 22) -> 1
	 	//play (22, 23) -> 0
	
	
	//Solution:
	
	public static int play(int a, int b) {
		if (a <= 21) {
			if (b <= 21 && b > a) {
				return b;
			}else if (b <= 21 && b< a ) {
				return a;
			}else return a;
		} else if (a > 21) {
			if (b <= 21) {
				return b;
			}else return 0;
		} return 0;
		
	}
	
	
	
	public static void main(String[] args) {
						
		//Test exercise 1:
		
		System.out.println("The result is: "+ calc(2,7,true)); // return 5
		System.out.println("The result is: "+ calc(2,7,false));// return 14
		
		
		//Test exercise 2:
		System.out.println(play (13,20));
		

	}

}
