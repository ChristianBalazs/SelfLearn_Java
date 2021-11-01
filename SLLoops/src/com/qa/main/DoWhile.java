package com.qa.main;


public class DoWhile {
	
	
	 public static int playCount = 0;  // integer playCount set up outside main class
	 public static boolean playing = true;  // boolean playing set up outside main class
	

	public static void main(String[] args) {
		
		// do {code to execute} while (condition);
		
		// The loop will always be executed at least once, even if the condition is false
		
		//Example 1:
		// will print 0,1,2,3,4 on 5 on separate line each
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
		
		
		System.out.println("==========");
		
		
		
		//Example 2:
		// will print 5 , despite condition is false since 7 is not less than 5
		
		int a = 7;
		do {
		  System.out.println(i);
		  a++;
		}
		while (a < 5);
		
		
		
		
		//Another example:
		 do {
	            System.out.println("Playing"); // execute: print "Playing"
	            playCount++;				  // execute: increase playCount integer by 1

	            if(playCount > 10) {		// if condition : if playCou
	                playing = false;		// playing boolean turns into false
	            }
	        } while(playing);			     // condition : playing boolean has value of true 

	        System.out.println("Game Over!"); // print outside of do while loop
	    }
		
		
		
		
		
		
		

	}


