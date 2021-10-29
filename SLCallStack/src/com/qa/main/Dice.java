package com.qa.main;

import java.util.Random;// imported a framework for randon numbers

public class Dice {

	// Created rollTwoDTwenty() method
	 public static int rollTwoDTwenty() {
	        int total = 0;
	        total = total + rollAgain();
	        total += rollAgain();
	        return total;
	    }
	 
	 // Created rollDTwenty() method
	    public static int rollAgain() {
	        return new Random().nextInt(21);
	    }
	
	
}
