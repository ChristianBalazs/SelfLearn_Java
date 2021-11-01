package com.qa.main;

import java.util.Scanner;

public class BlackExercise {

	
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
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter first number: ");    
	    Integer num1 = myObj.nextInt();  // Read user input      
	    System.out.println("Enter second number: ");
	    Integer num2 = myObj.nextInt();  // Read the second user input
	    
	    System.out.println("num1 is: " + num1 + " and num2 is: " + num2);

	    
	    System.out.println("Result is: " +play(num1, num2));
	    
	}

}
